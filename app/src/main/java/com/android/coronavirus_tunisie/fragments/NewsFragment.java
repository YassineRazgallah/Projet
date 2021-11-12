package com.android.coronavirus_tunisie.fragments;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.android.coronavirus_tunisie.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    ListView listView;
    /*String[] titles;
    String[] description;
    int[] imgs={R.drawable.death_icon,R.drawable.death_icon,R.drawable.death_icon,R.drawable.death_icon};*/


    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);
        // Inflate the layout for this fragment
        String[] menuItems={
                "Les tests virologiques (RT-PCR) permettent de déterminer si une personne est porteuse du virus au moment du test grâce à un prélèvement par voie nasale. Le résultat est en général disponible 24 heures après"
                ,"Les tests sérologiques permettent de rechercher si une personne a développé une réaction immunitaire après avoir été en contact avec le virus."
                ,"Les résultats de votre test de dépistage sont normalement disponibles au plus tard 24 heures après la réalisation du test"
                ,"Le Président de la République s’adressera aux Français ce soir, à 20h.",
                "Notre plan de relance sera vert. Echanges intéressants avec les économistes Cameron Hepburn, Nicholas Stern, Joseph Stiglitz, Dimitri Zenghelis et Brian O’Callaghan sur la nécessité d’accélérer la transition écologique de nos économies.",
                "Vous avez un pouvoir immense : celui de sauver des dizaines de vies, en quelques minutes, grâce à un geste simple ! Ce week-end, rendez-vous dans l’établissement le plus proche pour faire don de votre sang "
                ,"Hopla, nouvelle journée, nouvelle garde de 24 heures aux urgences puis au SAMU. L’activité a repris comme avant #COVID19 ! Alors un petit café pour se donner du courage. Faites attention à vous qu’on ne vienne pas vous chercher ! Bon week-end à tous Visage rigolard avec des yeux rieurs",
                "ujourd'hui, c'est la journée mondiale des donneurs de sang ,Les réserves de sang sont en dessous du seuil d'alerte",
                "Les Parisiens ne se sentent plus en sécurité dans leur ville. C’est pour cela que nous créerons une véritable police municipale. Elle sera une police de voisinage, ancrée dans les quartiers, et pourra être jointe 24h/24 par téléphone"
                    };


        listView= view.findViewById(R.id.list1);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);
        return view;

    }


}
