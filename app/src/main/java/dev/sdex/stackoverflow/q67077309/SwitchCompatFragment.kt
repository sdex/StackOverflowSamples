package dev.sdex.stackoverflow.q67077309

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.sdex.stackoverflow.databinding.FragmentSwitchCompatBinding

class SwitchCompatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSwitchCompatBinding.inflate(
            inflater,
            container,
            false
        )
        binding.viewModel = FakeViewModel()
        return binding.root
    }
}