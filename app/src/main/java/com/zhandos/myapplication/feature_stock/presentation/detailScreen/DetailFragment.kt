package com.zhandos.myapplication.feature_stock.presentation.detailScreen

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.opengl.ETC1.getHeight
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.formatter.IFillFormatter
import com.zhandos.myapplication.databinding.FragmentDetailBinding
import kotlin.random.Random


class DetailFragment: Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.chart.setViewPortOffsets(0f, 0f, 0f, 0f);

        // no description text
        binding.chart.description.isEnabled = false

        // enable touch gestures
        binding.chart.setTouchEnabled(true)

        // enable scaling and dragging
        binding.chart.isScaleXEnabled = true
        binding.chart.isDragEnabled = true

        // if disabled, scaling can be done on x- and y-axis separately
        binding.chart.setPinchZoom(false)
        binding.chart.setDrawGridBackground(false)
        binding.chart.maxHighlightDistance = 300f


        binding.chart.xAxis.isEnabled = false

        val y: YAxis = binding.chart.axisLeft
        y.setLabelCount(6, false)
        y.textColor = Color.WHITE
        y.setPosition(YAxis.YAxisLabelPosition.INSIDE_CHART)
        y.setDrawGridLines(false)
        y.axisLineColor = Color.WHITE

        binding.chart.axisRight.isEnabled = false
        binding.chart.axisLeft.isEnabled = false

        binding.chart.legend.isEnabled = false;

        binding.chart.animateXY(2000, 2000);


        setData()

        //binding.chart.invalidate();


        return view
    }

    private fun setData() {
        val list = mutableListOf<Entry>()
        for (i in 0..40) {
            list.add(Entry(i.toFloat(), Random.nextFloat()))
        }

        val set1 = LineDataSet(list, "Chart")

        set1.mode = LineDataSet.Mode.CUBIC_BEZIER
        set1.cubicIntensity = 0.2f
        set1.setDrawFilled(true)
        set1.setDrawCircles(false)
        set1.lineWidth = 2f
        set1.setCircleColor(Color.WHITE)
        set1.highLightColor = Color.rgb(244, 117, 117)
        set1.color = Color.BLACK
        set1.fillColor = Color.GRAY
        set1.fillAlpha = 10
        set1.setDrawHorizontalHighlightIndicator(false)
        set1.fillFormatter = IFillFormatter { dataSet, dataProvider ->
            binding.chart.axisLeft.axisMinimum
        }

        val data = LineData(set1)
        data.setValueTextSize(9f);
        data.setDrawValues(false);

        binding.chart.data = data
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}