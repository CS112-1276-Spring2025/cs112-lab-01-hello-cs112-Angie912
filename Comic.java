public class Comic {

    private String writer;
    private String illustrator;
    private String colorist;
    private String title;
    private int issueNum;

    //constructors
    public Comic(String writer, String illustrator, String colorist, String title, int issueNume) {
        this.setWriter(writer);
        this.setIllustrator(illustrator);
        this.setColorist(colorist);
        this.setTitle(title);
        this.setIssueNum(issueNum);
    }

    //default constructor

    public Comic() {
        this("Iro", "Aida", "Aida and Iro", "Toilet-Bound Hanako-Kun", 115);
    }

    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIllustrator() {
        return illustrator;
    }
    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getColorist() {
        return colorist;
    }
    public void setColorist(String colorist) {
        this.colorist = colorist;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }
    
    @Override
    public String toString() {
        return "a manga " +
                "drawn by '" + illustrator + '\'' +
                ", written by '" + writer + '\'' +
                ", colored by '" + colorist + '\'' +
                ", titled '" + title + '\'' +
                ", and the issue number is " + issueNum +
                '!';
    }

    public boolean equals(Comic other) {
        //always check for null!!
        if (other == null) {
            return false;
        }

        return this.writer.equals(other.writer) && this.illustrator.equals(other.illustrator) && 
                this.colorist.equals(other.colorist) && this.title.equals(other.title)
                && this.issueNum == other.issueNum;
    }

}