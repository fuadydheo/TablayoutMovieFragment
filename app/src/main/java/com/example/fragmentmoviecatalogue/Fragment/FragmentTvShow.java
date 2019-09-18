package com.example.fragmentmoviecatalogue.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragmentmoviecatalogue.R;
import com.example.fragmentmoviecatalogue.adapter.TvShowRecyclerView;
import com.example.fragmentmoviecatalogue.model.TvShow;

import java.util.ArrayList;
import java.util.List;

public class FragmentTvShow extends Fragment {

    View v;
    private RecyclerView irecyclerview;
    private List<TvShow> TvShowList;

    public FragmentTvShow() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.movie_fragment,container,false);
        irecyclerview = (RecyclerView) v.findViewById(R.id.listmovie_recyclerview);
        TvShowRecyclerView recycleViewAdapter = new TvShowRecyclerView(getContext(), TvShowList);
        irecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        irecyclerview.setAdapter(recycleViewAdapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TvShowList = new ArrayList<>();
        TvShowList.add(new TvShow("When I Grow Up","Mikaela explores different careers to figure out what she wants to be when she grows up",R.drawable.poster_growup));
        TvShowList.add(new TvShow("The Flash","After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",R.drawable.poster_flash));
        TvShowList.add(new TvShow("Arrow","Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",R.drawable.poster_arrow));
        TvShowList.add(new TvShow("The Boys","A group of vigilantes known informally as “The Boys” set out to take down corrupt superheroes with no more than blue-collar grit and a willingness to fight dirty.",R.drawable.poster_the_boys));
        TvShowList.add(new TvShow("Supernatural ","When they were boys, Sam and Dean Winchester lost their mother to a mysterious and demonic supernatural force. Subsequently, their father raised them to be soldiers. He taught them about the paranormal evil that lives in the dark corners and on the back roads of America ... and he taught them how to kill it. Now, the Winchester brothers crisscross the country in their '67 Chevy Impala, battling every kind of supernatural threat they encounter along the way.",R.drawable.poster_supernatural));
        TvShowList.add(new TvShow("Family Guy","Sick, twisted, politically incorrect and Freakin' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he's not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues.",R.drawable.poster_family_guys));
        TvShowList.add(new TvShow("Gotham","Everyone knows the name Commissioner Gordon. He is one of the crime world's greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon's story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world's most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?",R.drawable.poster_the_gotham));
        TvShowList.add(new TvShow("The Simpsons","Set in Springfield, the average American town, the show focuses on the antics and everyday adventures of the Simpson family; Homer, Marge, Bart, Lisa and Maggie, as well as a virtual cast of thousands. Since the beginning, the series has been a pop culture icon, attracting hundreds of celebrities to guest star. The show has also made name for itself in its fearless satirical take on politics, media and American life in general.",R.drawable.poster_the_simpsons));
        TvShowList.add(new TvShow("Marvel's Agents of S.H.I.E.L.D. ","Agent Phil Coulson of S.H.I.E.L.D. (Strategic Homeland Intervention, Enforcement and Logistics Division) puts together a team of agents to investigate the new, the strange and the unknown around the globe, protecting the ordinary from the extraordinary.",R.drawable.poster_shields));
        TvShowList.add(new TvShow("Game of Thrones","Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night's Watch, is all that stands between the realms of men and icy horrors beyond.",R.drawable.poster_got));

    }
}
