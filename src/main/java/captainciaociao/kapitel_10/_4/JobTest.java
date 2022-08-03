package captainciaociao.kapitel_10._4;

public class JobTest {
    /**
     * meine Idee ist schlecht wegen code duplication und schlechter wartbarkeit.
     *
     */
    public static void apply(Job job) {
        if (job instanceof NonEssentialJob) {
            NonEssentialJob nonEssJob = (NonEssentialJob) job;
            System.out.println(nonEssJob.name());
        } else if (job instanceof EssentialJob) {
            EssentialJob essJob = (EssentialJob) job;
            System.out.println(essJob.name());
        }
    }

    /**
     * Musterlösung
     *
     */
    public static <JOB extends Enum<JOB> & Job> void apply2(JOB job) {
        System.out.println(job.name());
    }

    public static void main(String[] args) {
        apply(NonEssentialJob.MATE);
        apply(EssentialJob.BOATSWAIN);
    }
}
