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
import com.example.fragmentmoviecatalogue.adapter.MovieRecyclerView;
import com.example.fragmentmoviecatalogue.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class FragmentMovie extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Movie> ListMovies;

    public FragmentMovie() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       v = inflater.inflate(R.layout.movie_fragment,container,false);
       myrecyclerview = (RecyclerView) v.findViewById(R.id.listmovie_recyclerview);
        MovieRecyclerView recycleViewAdapter = new MovieRecyclerView(getContext(), ListMovies);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recycleViewAdapter);

        return v;

    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListMovies = new ArrayList<>();
        ListMovies.add(new Movie("Aquaman","Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",R.drawable.poster_aquaman));
        ListMovies.add(new Movie("Avenger","After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.",R.drawable.poster_avengerinfinity));
        ListMovies.add(new Movie("Birdbox","Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",R.drawable.poster_birdbox));
        ListMovies.add(new Movie("Deadpoool","Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.",R.drawable.poster_deadpool));
        ListMovies.add(new Movie("Glass","In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",R.drawable.poster_glass));
        ListMovies.add(new Movie("Bumblebee","On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",R.drawable.poster_bumblebee));
        ListMovies.add(new Movie("Creed","Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",R.drawable.poster_creed));
        ListMovies.add(new Movie("Robin Hood","A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",R.drawable.poster_robinhood));
        ListMovies.add(new Movie("The Mule","Earl Stone, a man in his 80s, is broke, alone, and facing foreclosure of his business when he is offered a job that simply requires him to drive. Easy enough, but, unbeknownst to Earl, he’s just signed on as a drug courier for a Mexican cartel. He does so well that his cargo increases exponentially, and Earl hit the radar of hard-charging DEA agent Colin Bates.",R.drawable.poster_themule));
        ListMovies.add(new Movie("Mortal Engines","Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",R.drawable.poster_mortalengine));
    }
}
