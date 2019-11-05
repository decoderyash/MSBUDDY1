package com.example.anew.msbuddy;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by New on 23/09/2017.
 */
public class universityranking_fragment extends Fragment {
    @Nullable
   // @Override
    View myview;
    RecyclerView recyclerView;
    List<article_uni> articleList = new ArrayList<>();
    article_title_location_rank_adapter articletitleAdapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       myview = inflater.inflate(R.layout.universityranking, container ,false);

        recyclerView=(RecyclerView) myview.findViewById(R.id.recycler_view);
        // prepareArticleData();
        if(recyclerView!=null) {
            articletitleAdapter = new article_title_location_rank_adapter(articleList);
            RecyclerView.LayoutManager aLayoutManager = new LinearLayoutManager(this.getActivity());
            recyclerView.setLayoutManager(aLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));

            recyclerView.setAdapter(articletitleAdapter);
            prepareArticleData();
            recyclerView.addOnItemTouchListener(new RecyclerTouchListener(this.getActivity(), recyclerView, new ClickListener() {

                public void onClick(View view, int position) {
                    article_uni arti = articleList.get(position);
                    //  Toast.makeText(view.getContext(), arti.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
                    Context context;
                    context=view.getContext();
                    Intent i = new Intent(context, university_ScrollingActivity.class);
                    i.putExtra("article_position" , position);
                    context.startActivity(i);

                }

                public void onLongClick(View view, int position) {

                }
            }));

        }
        else
        {
            Toast.makeText(this.getActivity(),"monika",Toast.LENGTH_SHORT).show();
        }

        return myview;
    }
    private void prepareArticleData() {
        article_uni arti = new article_uni("How much is the GRE exam fee?"  ,"patel");
        articleList.add(arti);



        arti = new article_uni("Princeton University	" , "	1	");		articleList.add(arti);
        arti = new article_uni("Harvard University	" , "	2	");		articleList.add(arti);
        arti = new article_uni("University of Chicago	" , "	3	");		articleList.add(arti);
        arti = new article_uni("Yale University	" , "	3	");		articleList.add(arti);
        arti = new article_uni("Columbia University	" , "	5	");		articleList.add(arti);
        arti = new article_uni("Stanford University	" , "	5	");		articleList.add(arti);
        arti = new article_uni("Massachusetts Institute of Technology	" , "	7	");		articleList.add(arti);
        arti = new article_uni("Duke University	" , "	8	");		articleList.add(arti);
        arti = new article_uni("University of Pennsylvania	" , "	8	");		articleList.add(arti);
        arti = new article_uni("Johns Hopkins University	" , "	10	");		articleList.add(arti);
        arti = new article_uni("Dartmouth College	" , "	11	");		articleList.add(arti);
        arti = new article_uni("California Institute of Technology	" , "	12	");		articleList.add(arti);
        arti = new article_uni("Northwestern University	" , "	12	");		articleList.add(arti);
        arti = new article_uni("Brown University	" , "	14	");		articleList.add(arti);
        arti = new article_uni("Cornell University	" , "	15	");		articleList.add(arti);
        arti = new article_uni("Rice University	" , "	15	");		articleList.add(arti);
        arti = new article_uni("University of Notre Dame	" , "	15	");		articleList.add(arti);
        arti = new article_uni("Vanderbilt University	" , "	15	");		articleList.add(arti);
        arti = new article_uni("Washington University in St. Louis	" , "	19	");		articleList.add(arti);
        arti = new article_uni("Emory University	" , "	20	");		articleList.add(arti);
        arti = new article_uni("Georgetown University	" , "	20	");		articleList.add(arti);
        arti = new article_uni("University of California--Berkeley	" , "	20	");		articleList.add(arti);
        arti = new article_uni("University of Southern California	" , "	23	");		articleList.add(arti);
        arti = new article_uni("Carnegie Mellon University	" , "	24	");		articleList.add(arti);
        arti = new article_uni("University of California--Los Angeles	" , "	24	");		articleList.add(arti);
        arti = new article_uni("University of Virginia	" , "	24	");		articleList.add(arti);
        arti = new article_uni("Tufts University	" , "	27	");		articleList.add(arti);
        arti = new article_uni("University of Michigan--Ann Arbor	" , "	27	");		articleList.add(arti);
        arti = new article_uni("Wake Forest University	" , "	27	");		articleList.add(arti);
        arti = new article_uni("University of North Carolina--Chapel Hill	" , "	30	");		articleList.add(arti);
        arti = new article_uni("Boston College	" , "	31	");		articleList.add(arti);
        arti = new article_uni("College of William & Mary	" , "	32	");		articleList.add(arti);
        arti = new article_uni("University of Rochester	" , "	32	");		articleList.add(arti);
        arti = new article_uni("Brandeis University	" , "	34	");		articleList.add(arti);
        arti = new article_uni("Georgia Institute of Technology	" , "	34	");		articleList.add(arti);
        arti = new article_uni("New York University	" , "	36	");		articleList.add(arti);
        arti = new article_uni("Case Western Reserve University	" , "	37	");		articleList.add(arti);
        arti = new article_uni("University of California--Santa Barbara	" , "	37	");		articleList.add(arti);
        arti = new article_uni("Boston University	" , "	39	");		articleList.add(arti);
        arti = new article_uni("Northeastern University	" , "	39	");		articleList.add(arti);
        arti = new article_uni("Rensselaer Polytechnic Institute	" , "	39	");		articleList.add(arti);
        arti = new article_uni("Tulane University	" , "	39	");		articleList.add(arti);
        arti = new article_uni("University of California--Irvine	" , "	39	");		articleList.add(arti);
        arti = new article_uni("Lehigh University	" , "	44	");		articleList.add(arti);
        arti = new article_uni("University of California--Davis	" , "	44	");		articleList.add(arti);
        arti = new article_uni("University of California--San Diego	" , "	44	");		articleList.add(arti);
        arti = new article_uni("University of Illinois--Urbana-Champaign	" , "	44	");		articleList.add(arti);
        arti = new article_uni("University of Miami	" , "	44	");		articleList.add(arti);
        arti = new article_uni("University of Wisconsin--Madison	" , "	44	");		articleList.add(arti);
        arti = new article_uni("Pepperdine University	" , "	50	");		articleList.add(arti);
        arti = new article_uni("University of Florida	" , "	50	");		articleList.add(arti);
        arti = new article_uni("Villanova University	" , "	50	");		articleList.add(arti);
        arti = new article_uni("Pennsylvania State University--University Park	" , "	50	");		articleList.add(arti);
        arti = new article_uni("Ohio State University--Columbus	" , "	54	");		articleList.add(arti);
        arti = new article_uni("University of Washington	" , "	54	");		articleList.add(arti);
        arti = new article_uni("George Washington University	" , "	56	");		articleList.add(arti);
        arti = new article_uni("Southern Methodist University	" , "	56	");		articleList.add(arti);
        arti = new article_uni("University of Georgia	" , "	56	");		articleList.add(arti);
        arti = new article_uni("University of Texas--Austin	" , "	56	");		articleList.add(arti);
        arti = new article_uni("Fordham University	" , "	60	");		articleList.add(arti);
        arti = new article_uni("Purdue University--West Lafayette	" , "	60	");		articleList.add(arti);
        arti = new article_uni("Syracuse University	" , "	60	");		articleList.add(arti);
        arti = new article_uni("University of Connecticut	" , "	60	");		articleList.add(arti);
        arti = new article_uni("University of Maryland--College Park	" , "	60	");		articleList.add(arti);
        arti = new article_uni("Worcester Polytechnic Institute	" , "	60	");		articleList.add(arti);
        arti = new article_uni("Clemson University	" , "	66	");		articleList.add(arti);
        arti = new article_uni("Yeshiva University	" , "	66	");		articleList.add(arti);
        arti = new article_uni("Brigham Young University--Provo	" , "	68	");		articleList.add(arti);
        arti = new article_uni("University of Pittsburgh	" , "	68	");		articleList.add(arti);
        arti = new article_uni("Rutgers University--New Brunswick	" , "	70	");		articleList.add(arti);
        arti = new article_uni("Baylor University	" , "	71	");		articleList.add(arti);
        arti = new article_uni("Stevens Institute of Technology	" , "	71	");		articleList.add(arti);
        arti = new article_uni("University of Minnesota--Twin Cities	" , "	71	");		articleList.add(arti);
        arti = new article_uni("American University	" , "	74	");		articleList.add(arti);
        arti = new article_uni("Clark University	" , "	74	");		articleList.add(arti);
        arti = new article_uni("Texas A&M University--College Station	" , "	74	");		articleList.add(arti);
        arti = new article_uni("University of Massachusetts--Amherst	" , "	74	");		articleList.add(arti);
        arti = new article_uni("Virginia Tech	" , "	74	");		articleList.add(arti);
        arti = new article_uni("Miami University--Oxford	" , "	79	");		articleList.add(arti);
        arti = new article_uni("University of California--Santa Cruz	" , "	79	");		articleList.add(arti);
        arti = new article_uni("University of Delaware	" , "	79	");		articleList.add(arti);
        arti = new article_uni("Colorado School of Mines	" , "	82	");		articleList.add(arti);
        arti = new article_uni("Michigan State University	" , "	82	");		articleList.add(arti);
        arti = new article_uni("Texas Christian University	" , "	82	");		articleList.add(arti);
        arti = new article_uni("University of Iowa	" , "	82	");		articleList.add(arti);
        arti = new article_uni("Binghamton University--SUNY	" , "	86	");		articleList.add(arti);
        arti = new article_uni("Indiana University--Bloomington	" , "	86	");		articleList.add(arti);
        arti = new article_uni("Marquette University	" , "	86	");		articleList.add(arti);
        arti = new article_uni("University of Denver	" , "	86	");		articleList.add(arti);
        arti = new article_uni("University of San Diego	" , "	86	");		articleList.add(arti);
        arti = new article_uni("University of Tulsa	" , "	86	");		articleList.add(arti);
        arti = new article_uni("Florida State University	" , "	92	");		articleList.add(arti);
        arti = new article_uni("North Carolina State University--Raleigh	" , "	92	");		articleList.add(arti);
        arti = new article_uni("University of Colorado--Boulder	" , "	92	");		articleList.add(arti);
        arti = new article_uni("University of Vermont	" , "	92	");		articleList.add(arti);
        arti = new article_uni("Drexel University	" , "	96	");		articleList.add(arti);
        arti = new article_uni("Saint Louis University	" , "	96	");		articleList.add(arti);
        arti = new article_uni("Stony Brook University--SUNY	" , "	96	");		articleList.add(arti);
        arti = new article_uni("Auburn University	" , "	99	");		articleList.add(arti);
        arti = new article_uni("Loyola University Chicago	" , "	99	");		articleList.add(arti);
        arti = new article_uni("SUNY College of Environmental Science and Forestry	" , "	99	");		articleList.add(arti);
        arti = new article_uni("University at Buffalo--SUNY	" , "	99	");		articleList.add(arti);
        arti = new article_uni("Illinois Institute of Technology	" , "	103	");		articleList.add(arti);
        arti = new article_uni("University of Alabama	" , "	103	");		articleList.add(arti);
        arti = new article_uni("University of Oregon	" , "	103	");		articleList.add(arti);
        arti = new article_uni("University of Tennessee	" , "	103	");		articleList.add(arti);
        arti = new article_uni("Rochester Institute of Technology	" , "	107	");		articleList.add(arti);
        arti = new article_uni("University of New Hampshire	" , "	107	");		articleList.add(arti);
        arti = new article_uni("University of San Francisco	" , "	107	");		articleList.add(arti);
        arti = new article_uni("University of South Carolina	" , "	107	");		articleList.add(arti);
        arti = new article_uni("Iowa State University	" , "	111	");		articleList.add(arti);
        arti = new article_uni("University of Dayton	" , "	111	");		articleList.add(arti);
        arti = new article_uni("University of Missouri	" , "	111	");		articleList.add(arti);
        arti = new article_uni("University of Nebraska--Lincoln	" , "	111	");		articleList.add(arti);
        arti = new article_uni("University of Oklahoma	" , "	111	");		articleList.add(arti);
        arti = new article_uni("University of the Pacific	" , "	111	");		articleList.add(arti);
        arti = new article_uni("University of Utah	" , "	111	");		articleList.add(arti);
        arti = new article_uni("Michigan Technological University	" , "	118	");		articleList.add(arti);
        arti = new article_uni("Seton Hall University	" , "	118	");		articleList.add(arti);
        arti = new article_uni("Temple University	" , "	118	");		articleList.add(arti);
        arti = new article_uni("University of California--Riverside	" , "	118	");		articleList.add(arti);
        arti = new article_uni("University of Kansas	" , "	118	");		articleList.add(arti);
        arti = new article_uni("University of St. Thomas	" , "	118	");		articleList.add(arti);
        arti = new article_uni("The Catholic University of America	" , "	124	");		articleList.add(arti);
        arti = new article_uni("DePaul University	" , "	124	");		articleList.add(arti);
        arti = new article_uni("Duquesne University	" , "	124	");		articleList.add(arti);
        arti = new article_uni("Howard University	" , "	124	");		articleList.add(arti);
        arti = new article_uni("University of Arizona	" , "	124	");		articleList.add(arti);
        arti = new article_uni("Arizona State University--Tempe	" , "	129	");		articleList.add(arti);
        arti = new article_uni("Clarkson University	" , "	129	");		articleList.add(arti);
        arti = new article_uni("Colorado State University	" , "	129	");		articleList.add(arti);
        arti = new article_uni("New School	" , "	129	");		articleList.add(arti);
        arti = new article_uni("Hofstra University	" , "	133	");		articleList.add(arti);
        arti = new article_uni("University of Kentucky	" , "	133	");		articleList.add(arti);
        arti = new article_uni("Kansas State University	" , "	135	");		articleList.add(arti);
        arti = new article_uni("Louisiana State University--Baton Rouge	" , "	135	");		articleList.add(arti);
        arti = new article_uni("Mercer University	" , "	135	");		articleList.add(arti);
        arti = new article_uni("New Jersey Institute of Technology	" , "	135	");		articleList.add(arti);
        arti = new article_uni("Rutgers University--Newark	" , "	135	");		articleList.add(arti);
        arti = new article_uni("University of Arkansas	" , "	135	");		articleList.add(arti);
        arti = new article_uni("University of Cincinnati	" , "	135	");		articleList.add(arti);
        arti = new article_uni("University of Mississippi	" , "	135	");		articleList.add(arti);
        arti = new article_uni("George Mason University	" , "	143	");		articleList.add(arti);
        arti = new article_uni("Oregon State University	" , "	143	");		articleList.add(arti);
        arti = new article_uni("Washington State University	" , "	143	");		articleList.add(arti);
        arti = new article_uni("Adelphi University	" , "	146	");		articleList.add(arti);
        arti = new article_uni("Ohio University	" , "	146	");		articleList.add(arti);
        arti = new article_uni("San Diego State University	" , "	146	");		articleList.add(arti);
        arti = new article_uni("St. John Fisher College	" , "	146	");		articleList.add(arti);
        arti = new article_uni("University at Albany--SUNY	" , "	146	");		articleList.add(arti);
        arti = new article_uni("University of Texas--Dallas	" , "	146	");		articleList.add(arti);
        arti = new article_uni("Illinois State University	" , "	152	");		articleList.add(arti);
        arti = new article_uni("Immaculata University	" , "	152	");		articleList.add(arti);
        arti = new article_uni("Oklahoma State University	" , "	152	");		articleList.add(arti);
        arti = new article_uni("University of California--Merced	" , "	152	");		articleList.add(arti);
        arti = new article_uni("University of Illinois--Chicago	" , "	152	");		articleList.add(arti);
        arti = new article_uni("University of La Verne	" , "	152	");		articleList.add(arti);
        arti = new article_uni("University of Massachusetts--Lowell	" , "	152	");		articleList.add(arti);
        arti = new article_uni("Seattle Pacific University	" , "	159	");		articleList.add(arti);
        arti = new article_uni("University of Alabama--Birmingham	" , "	159	");		articleList.add(arti);
        arti = new article_uni("University of Maryland--Baltimore County	" , "	159	");		articleList.add(arti);
        arti = new article_uni("University of Rhode Island	" , "	159	");		articleList.add(arti);
        arti = new article_uni("University of South Florida	" , "	159	");		articleList.add(arti);
        arti = new article_uni("Biola University	" , "	164	");		articleList.add(arti);
        arti = new article_uni("Maryville University of St. Louis	" , "	164	");		articleList.add(arti);
        arti = new article_uni("Missouri University of Science & Technology	" , "	164	");		articleList.add(arti);
        arti = new article_uni("St. John's University	" , "	164	");		articleList.add(arti);
        arti = new article_uni("Virginia Commonwealth University	" , "	164	");		articleList.add(arti);
        arti = new article_uni("Union University	" , "	169	");		articleList.add(arti);
        arti = new article_uni("University of Hawaii--Manoa	" , "	169	");		articleList.add(arti);
        arti = new article_uni("Edgewood College	" , "	171	");		articleList.add(arti);
        arti = new article_uni("Florida Institute of Technology	" , "	171	");		articleList.add(arti);
        arti = new article_uni("University of Idaho	" , "	171	");		articleList.add(arti);
        arti = new article_uni("University of Louisville	" , "	171	");		articleList.add(arti);
        arti = new article_uni("University of Wyoming	" , "	171	");		articleList.add(arti);
        arti = new article_uni("Ball State University	" , "	176	");		articleList.add(arti);
        arti = new article_uni("Lipscomb University	" , "	176	");		articleList.add(arti);
        arti = new article_uni("Mississippi State University	" , "	176	");		articleList.add(arti);
        arti = new article_uni("Montclair State University	" , "	176	");		articleList.add(arti);
        arti = new article_uni("Texas Tech University	" , "	176	");		articleList.add(arti);
        arti = new article_uni("University of Central Florida	" , "	176	");		articleList.add(arti);
        arti = new article_uni("University of New Mexico	" , "	176	");		articleList.add(arti);
        arti = new article_uni("Andrews University	" , "	183	");		articleList.add(arti);
        arti = new article_uni("Azusa Pacific University	" , "	183	");		articleList.add(arti);
        arti = new article_uni("University of Maine	" , "	183	");		articleList.add(arti);
        arti = new article_uni("West Virginia University	" , "	183	");		articleList.add(arti);
        arti = new article_uni("Widener University	" , "	183	");		articleList.add(arti);
        arti = new article_uni("Kent State University	" , "	188	");		articleList.add(arti);
        arti = new article_uni("North Dakota State University	" , "	188	");		articleList.add(arti);
        arti = new article_uni("Pace University	" , "	188	");		articleList.add(arti);
        arti = new article_uni("Robert Morris University	" , "	188	");		articleList.add(arti);
        arti = new article_uni("Suffolk University	" , "	188	");		articleList.add(arti);
        arti = new article_uni("University of Hartford	" , "	188	");		articleList.add(arti);
        arti = new article_uni("Bowling Green State University	" , "	194	");		articleList.add(arti);
        arti = new article_uni("University of Houston	" , "	194	");		articleList.add(arti);
        arti = new article_uni("Western Michigan University	" , "	194	");		articleList.add(arti);
        arti = new article_uni("Indiana University-Purdue University--Indianapolis	" , "	197	");		articleList.add(arti);
        arti = new article_uni("Lesley University	" , "	197	");		articleList.add(arti);
        arti = new article_uni("University of Alabama--Huntsville	" , "	197	");		articleList.add(arti);
        arti = new article_uni("University of Colorado--Denver	" , "	197	");		articleList.add(arti);
        arti = new article_uni("University of Nevada--Reno	" , "	197	");		articleList.add(arti);
        arti = new article_uni("California State University--Fullerton	" , "	202	");		articleList.add(arti);
        arti = new article_uni("Central Michigan University	" , "	202	");		articleList.add(arti);
        arti = new article_uni("Louisiana Tech University	" , "	202	");		articleList.add(arti);
        arti = new article_uni("South Dakota State University	" , "	202	");		articleList.add(arti);
        arti = new article_uni("University of Alaska--Fairbanks	" , "	202	");		articleList.add(arti);
        arti = new article_uni("University of North Carolina--Charlotte	" , "	202	");		articleList.add(arti);
        arti = new article_uni("University of North Dakota	" , "	202	");		articleList.add(arti);
        arti = new article_uni("University of South Dakota	" , "	202	");		articleList.add(arti);
        arti = new article_uni("East Carolina University	" , "	210	");		articleList.add(arti);
        arti = new article_uni("Montana State University	" , "	210	");		articleList.add(arti);
        arti = new article_uni("Old Dominion University	" , "	210	");		articleList.add(arti);
        arti = new article_uni("University of Missouri--Kansas City	" , "	210	");		articleList.add(arti);
        arti = new article_uni("Ashland University	" , "	214	");		articleList.add(arti);
        arti = new article_uni("Dallas Baptist University	" , "	214	");		articleList.add(arti);
        arti = new article_uni("Northern Illinois University	" , "	214	");		articleList.add(arti);
        arti = new article_uni("Nova Southeastern University	" , "	214	");		articleList.add(arti);
        arti = new article_uni("Southern Illinois University--Carbondale	" , "	214	");		articleList.add(arti);
        arti = new article_uni("University of Montana	" , "	214	");		articleList.add(arti);
        arti = new article_uni("Benedictine University	" , "	220	");		articleList.add(arti);
        arti = new article_uni("California State University--Fresno	" , "	220	");		articleList.add(arti);
        arti = new article_uni("Gardner-Webb University	" , "	220	");		articleList.add(arti);
        arti = new article_uni("New Mexico State University	" , "	220	");		articleList.add(arti);
        arti = new article_uni("Shenandoah University	" , "	220	");		articleList.add(arti);
        arti = new article_uni("Tennessee Technological University	" , "	220	");		articleList.add(arti);
        arti = new article_uni("University of Massachusetts--Boston	" , "	220	");		articleList.add(arti);
        arti = new article_uni("University of Massachusetts--Dartmouth	" , "	220	");		articleList.add(arti);
        arti = new article_uni("University of Missouri--St. Louis	" , "	220	");		articleList.add(arti);
        arti = new article_uni("University of North Carolina--Greensboro	" , "	220	");		articleList.add(arti);
        arti = new article_uni("University of Southern Mississippi	" , "	220	");		articleList.add(arti);
        arti = new article_uni("Utah State University	" , "	220	");		articleList.add(arti);





        articletitleAdapter.notifyDataSetChanged();
    }


}
