package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mv1 = new MovieReview();
        mv1.title = "인셉션";
        mv1.review = "인생은 무한 루프";

        MovieReview mv2 = new MovieReview();
        mv2.title = "어바웃 타임";
        mv2.review = "인생 시간 영화";

        MovieReview[] movieReviews = {mv1, mv2};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목:" + movieReview.title + " 리뷰:" + movieReview.review);
        }
    }
}
