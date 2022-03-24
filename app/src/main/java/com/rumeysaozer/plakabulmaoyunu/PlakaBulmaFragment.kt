package com.rumeysaozer.plakabulmaoyunu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rumeysaozer.plakabulmaoyunu.databinding.FragmentPlakaBulmaBinding


class PlakaBulmaFragment : Fragment() {
    private var _binding: FragmentPlakaBulmaBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlakaBulmaBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            if(binding.editText.text.isNotEmpty()){
                var plakaKodu = binding.editText.text.toString().toInt()
                when(plakaKodu){
                    1-> binding.textView2.text= "Adana"
                    2-> binding.textView2.text= "Adıyaman"
                    3-> binding.textView2.text= "Afyon"
                    4-> binding.textView2.text= "Ağrı"
                    5-> binding.textView2.text= "Amasya"
                    6-> binding.textView2.text= "Ankara"
                    7-> binding.textView2.text= "Antalya"
                    8-> binding.textView2.text= "Artvin"
                    9-> binding.textView2.text= "Aydın"
                    10-> binding.textView2.text= "Balıkesir"
                    11-> binding.textView2.text= "Bilecik"
                    12-> binding.textView2.text= "Bingöl"
                    13-> binding.textView2.text= "Bitlis"
                    14-> binding.textView2.text= "Bolu"
                    15-> binding.textView2.text= "Burdur"
                    16-> binding.textView2.text= "Bursa"
                    17-> binding.textView2.text= "Çanakkale"
                    18-> binding.textView2.text= "Çankırı"
                    19-> binding.textView2.text= "Çorum"
                    20-> binding.textView2.text= "Denizli"
                    21-> binding.textView2.text= "Diyarbakır"
                    22-> binding.textView2.text= "Edirne"
                    23-> binding.textView2.text= "Elazığ"
                    24-> binding.textView2.text= "Erzincan"
                    25-> binding.textView2.text= "Erzurum"
                    26-> binding.textView2.text= "Eskişehir"
                    27-> binding.textView2.text= "Gaziantep"
                    28-> binding.textView2.text= "Giresun"
                    29-> binding.textView2.text= "Gümüşhane"
                    30-> binding.textView2.text= "Hakkari"
                    31-> binding.textView2.text= "Hatay"
                    32-> binding.textView2.text= "Isparta"
                    33-> binding.textView2.text= "Mersin"
                    34-> binding.textView2.text= "İstanbul"
                    35-> binding.textView2.text= "İzmir"
                    36-> binding.textView2.text= "Kars"
                    37-> binding.textView2.text= "Kastamonu"
                    38-> binding.textView2.text= "Kayseri"
                    39-> binding.textView2.text= "Kırklareli"
                    40-> binding.textView2.text= "Kırşehir"
                    41-> binding.textView2.text= "Kocaeli"
                    42-> binding.textView2.text= "Konya"
                    43-> binding.textView2.text= "Kütahya"
                    44-> binding.textView2.text= "Malatya"
                    45-> binding.textView2.text= "Manisa"
                    46-> binding.textView2.text= "Kahramanmaraş"
                    47-> binding.textView2.text= "Mardin"
                    48-> binding.textView2.text= "Muğla"
                    49-> binding.textView2.text= "Muş"
                    50-> binding.textView2.text= "Nevşehir"
                    51-> binding.textView2.text= "Niğde"
                    52-> binding.textView2.text= "Ordu"
                    53-> binding.textView2.text= "Rize"
                    54-> binding.textView2.text= "Sakarya"
                    55-> binding.textView2.text= "Samsun"
                    56-> binding.textView2.text= "Siirt"
                    57-> binding.textView2.text= "Sinop"
                    58-> binding.textView2.text= "Sivas"
                    59-> binding.textView2.text= "Tekirdağ"
                    60-> binding.textView2.text= "Tokat"
                    61-> binding.textView2.text= "Trabzon"
                    62-> binding.textView2.text= "Tunceli"
                    63-> binding.textView2.text= "Şanlıurfa"
                    64-> binding.textView2.text= "Uşak"
                    65-> binding.textView2.text= "Van"
                    66-> binding.textView2.text= "Yozgat"
                    67-> binding.textView2.text= "Zonguldak"
                    68-> binding.textView2.text= "Aksaray"
                    69-> binding.textView2.text= "Bayburt"
                    70-> binding.textView2.text= "Karaman"
                    71-> binding.textView2.text= "Kırıkkale"
                    72-> binding.textView2.text= "Batman"
                    73-> binding.textView2.text= "Şırnak"
                    74-> binding.textView2.text= "Bartın"
                    75-> binding.textView2.text= "Ardahan"
                    76-> binding.textView2.text= "Iğdır"
                    77-> binding.textView2.text= "Yalova"
                    78-> binding.textView2.text= "Karabük"
                    79-> binding.textView2.text= "Kilis"
                    80-> binding.textView2.text= "Osmaniye"
                    81-> binding.textView2.text= "Düzce"
                    else ->{
                        binding.textView2.text = "Bulunamadı"
                    }

                }

            }
            else{
                binding.textView2.text = "Plaka giriniz"
            }
            binding.editText.text.clear()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}