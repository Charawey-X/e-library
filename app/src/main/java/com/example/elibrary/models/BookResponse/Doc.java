
package com.example.elibrary.models.BookResponse;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Generated("jsonschema2pojo")

@Parcel
public class Doc {

    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("seed")
    @Expose
    private List<String> seed = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("title_suggest")
    @Expose
    private String titleSuggest;
    @SerializedName("edition_count")
    @Expose
    private Integer editionCount;
    @SerializedName("edition_key")
    @Expose
    private List<String> editionKey = null;
    @SerializedName("publish_date")
    @Expose
    private List<String> publishDate = null;
    @SerializedName("publish_year")
    @Expose
    private List<Integer> publishYear = null;
    @SerializedName("first_publish_year")
    @Expose
    private Integer firstPublishYear;
    @SerializedName("number_of_pages_median")
    @Expose
    private Integer numberOfPagesMedian;
    @SerializedName("lccn")
    @Expose
    private List<String> lccn = null;
    @SerializedName("publish_place")
    @Expose
    private List<String> publishPlace = null;
    @SerializedName("oclc")
    @Expose
    private List<String> oclc = null;
    @SerializedName("contributor")
    @Expose
    private List<String> contributor = null;
    @SerializedName("lcc")
    @Expose
    private List<String> lcc = null;
    @SerializedName("ddc")
    @Expose
    private List<String> ddc = null;
    @SerializedName("isbn")
    @Expose
    private List<String> isbn = null;
    @SerializedName("last_modified_i")
    @Expose
    private Integer lastModifiedI;
    @SerializedName("ia")
    @Expose
    private List<String> ia = null;
    @SerializedName("ebook_count_i")
    @Expose
    private Integer ebookCountI;
    @SerializedName("has_fulltext")
    @Expose
    private Boolean hasFulltext;
    @SerializedName("public_scan_b")
    @Expose
    private Boolean publicScanB;
    @SerializedName("ia_collection_s")
    @Expose
    private String iaCollectionS;
    @SerializedName("lending_edition_s")
    @Expose
    private String lendingEditionS;
    @SerializedName("lending_identifier_s")
    @Expose
    private String lendingIdentifierS;
    @SerializedName("printdisabled_s")
    @Expose
    private String printdisabledS;
    @SerializedName("cover_edition_key")
    @Expose
    private String coverEditionKey;
    @SerializedName("cover_i")
    @Expose
    private Integer coverI;
    @SerializedName("publisher")
    @Expose
    private List<String> publisher = null;
    @SerializedName("language")
    @Expose
    private List<String> language = null;
    @SerializedName("author_key")
    @Expose
    private List<String> authorKey = null;
    @SerializedName("author_name")
    @Expose
    private List<String> authorName = null;
    @SerializedName("author_alternative_name")
    @Expose
    private List<String> authorAlternativeName = null;
    @SerializedName("person")
    @Expose
    private List<String> person = null;
    @SerializedName("place")
    @Expose
    private List<String> place = null;
    @SerializedName("subject")
    @Expose
    private List<String> subject = null;
    @SerializedName("time")
    @Expose
    private List<String> time = null;
    @SerializedName("id_alibris_id")
    @Expose
    private List<String> idAlibrisId = null;
    @SerializedName("id_amazon")
    @Expose
    private List<String> idAmazon = null;
    @SerializedName("id_canadian_national_library_archive")
    @Expose
    private List<String> idCanadianNationalLibraryArchive = null;
    @SerializedName("id_dep\u00f3sito_legal")
    @Expose
    private List<String> idDepSitoLegal = null;
    @SerializedName("id_goodreads")
    @Expose
    private List<String> idGoodreads = null;
    @SerializedName("id_google")
    @Expose
    private List<String> idGoogle = null;
    @SerializedName("id_librarything")
    @Expose
    private List<String> idLibrarything = null;
    @SerializedName("id_overdrive")
    @Expose
    private List<String> idOverdrive = null;
    @SerializedName("id_paperback_swap")
    @Expose
    private List<String> idPaperbackSwap = null;
    @SerializedName("id_wikidata")
    @Expose
    private List<String> idWikidata = null;
    @SerializedName("ia_loaded_id")
    @Expose
    private List<String> iaLoadedId = null;
    @SerializedName("ia_box_id")
    @Expose
    private List<String> iaBoxId = null;
    @SerializedName("publisher_facet")
    @Expose
    private List<String> publisherFacet = null;
    @SerializedName("person_key")
    @Expose
    private List<String> personKey = null;
    @SerializedName("place_key")
    @Expose
    private List<String> placeKey = null;
    @SerializedName("time_facet")
    @Expose
    private List<String> timeFacet = null;
    @SerializedName("person_facet")
    @Expose
    private List<String> personFacet = null;
    @SerializedName("subject_facet")
    @Expose
    private List<String> subjectFacet = null;
    @SerializedName("_version_")
    @Expose
    private Long version;
    @SerializedName("place_facet")
    @Expose
    private List<String> placeFacet = null;
    @SerializedName("lcc_sort")
    @Expose
    private String lccSort;
    @SerializedName("author_facet")
    @Expose
    private List<String> authorFacet = null;
    @SerializedName("subject_key")
    @Expose
    private List<String> subjectKey = null;
    @SerializedName("ddc_sort")
    @Expose
    private String ddcSort;
    @SerializedName("time_key")
    @Expose
    private List<String> timeKey = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Doc() {
    }

    /**
     * 
     * @param ebookCountI
     * @param lendingEditionS
     * @param idPaperbackSwap
     * @param idAlibrisId
     * @param subject
     * @param publishDate
     * @param language
     * @param type
     * @param idDepSitoLegal
     * @param ddcSort
     * @param lccn
     * @param lendingIdentifierS
     * @param personKey
     * @param publicScanB
     * @param placeKey
     * @param lastModifiedI
     * @param firstPublishYear
     * @param ia
     * @param idAmazon
     * @param numberOfPagesMedian
     * @param editionKey
     * @param printdisabledS
     * @param idOverdrive
     * @param lccSort
     * @param editionCount
     * @param authorKey
     * @param idCanadianNationalLibraryArchive
     * @param publishPlace
     * @param timeFacet
     * @param idGoodreads
     * @param version
     * @param coverI
     * @param publishYear
     * @param authorName
     * @param person
     * @param publisher
     * @param publisherFacet
     * @param seed
     * @param iaBoxId
     * @param isbn
     * @param idWikidata
     * @param iaLoadedId
     * @param iaCollectionS
     * @param subjectFacet
     * @param title
     * @param placeFacet
     * @param lcc
     * @param hasFulltext
     * @param coverEditionKey
     * @param contributor
     * @param authorAlternativeName
     * @param place
     * @param personFacet
     * @param subjectKey
     * @param key
     * @param ddc
     * @param idLibrarything
     * @param authorFacet
     * @param idGoogle
     * @param oclc
     * @param time
     * @param timeKey
     * @param titleSuggest
     */
    public Doc(String key, String type, List<String> seed, String title, String titleSuggest, Integer editionCount, List<String> editionKey, List<String> publishDate, List<Integer> publishYear, Integer firstPublishYear, Integer numberOfPagesMedian, List<String> lccn, List<String> publishPlace, List<String> oclc, List<String> contributor, List<String> lcc, List<String> ddc, List<String> isbn, Integer lastModifiedI, List<String> ia, Integer ebookCountI, Boolean hasFulltext, Boolean publicScanB, String iaCollectionS, String lendingEditionS, String lendingIdentifierS, String printdisabledS, String coverEditionKey, Integer coverI, List<String> publisher, List<String> language, List<String> authorKey, List<String> authorName, List<String> authorAlternativeName, List<String> person, List<String> place, List<String> subject, List<String> time, List<String> idAlibrisId, List<String> idAmazon, List<String> idCanadianNationalLibraryArchive, List<String> idDepSitoLegal, List<String> idGoodreads, List<String> idGoogle, List<String> idLibrarything, List<String> idOverdrive, List<String> idPaperbackSwap, List<String> idWikidata, List<String> iaLoadedId, List<String> iaBoxId, List<String> publisherFacet, List<String> personKey, List<String> placeKey, List<String> timeFacet, List<String> personFacet, List<String> subjectFacet, Long version, List<String> placeFacet, String lccSort, List<String> authorFacet, List<String> subjectKey, String ddcSort, List<String> timeKey) {
        super();
        this.key = key;
        this.type = type;
        this.seed = seed;
        this.title = title;
        this.titleSuggest = titleSuggest;
        this.editionCount = editionCount;
        this.editionKey = editionKey;
        this.publishDate = publishDate;
        this.publishYear = publishYear;
        this.firstPublishYear = firstPublishYear;
        this.numberOfPagesMedian = numberOfPagesMedian;
        this.lccn = lccn;
        this.publishPlace = publishPlace;
        this.oclc = oclc;
        this.contributor = contributor;
        this.lcc = lcc;
        this.ddc = ddc;
        this.isbn = isbn;
        this.lastModifiedI = lastModifiedI;
        this.ia = ia;
        this.ebookCountI = ebookCountI;
        this.hasFulltext = hasFulltext;
        this.publicScanB = publicScanB;
        this.iaCollectionS = iaCollectionS;
        this.lendingEditionS = lendingEditionS;
        this.lendingIdentifierS = lendingIdentifierS;
        this.printdisabledS = printdisabledS;
        this.coverEditionKey = coverEditionKey;
        this.coverI = coverI;
        this.publisher = publisher;
        this.language = language;
        this.authorKey = authorKey;
        this.authorName = authorName;
        this.authorAlternativeName = authorAlternativeName;
        this.person = person;
        this.place = place;
        this.subject = subject;
        this.time = time;
        this.idAlibrisId = idAlibrisId;
        this.idAmazon = idAmazon;
        this.idCanadianNationalLibraryArchive = idCanadianNationalLibraryArchive;
        this.idDepSitoLegal = idDepSitoLegal;
        this.idGoodreads = idGoodreads;
        this.idGoogle = idGoogle;
        this.idLibrarything = idLibrarything;
        this.idOverdrive = idOverdrive;
        this.idPaperbackSwap = idPaperbackSwap;
        this.idWikidata = idWikidata;
        this.iaLoadedId = iaLoadedId;
        this.iaBoxId = iaBoxId;
        this.publisherFacet = publisherFacet;
        this.personKey = personKey;
        this.placeKey = placeKey;
        this.timeFacet = timeFacet;
        this.personFacet = personFacet;
        this.subjectFacet = subjectFacet;
        this.version = version;
        this.placeFacet = placeFacet;
        this.lccSort = lccSort;
        this.authorFacet = authorFacet;
        this.subjectKey = subjectKey;
        this.ddcSort = ddcSort;
        this.timeKey = timeKey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getSeed() {
        return seed;
    }

    public void setSeed(List<String> seed) {
        this.seed = seed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleSuggest() {
        return titleSuggest;
    }

    public void setTitleSuggest(String titleSuggest) {
        this.titleSuggest = titleSuggest;
    }

    public Integer getEditionCount() {
        return editionCount;
    }

    public void setEditionCount(Integer editionCount) {
        this.editionCount = editionCount;
    }

    public List<String> getEditionKey() {
        return editionKey;
    }

    public void setEditionKey(List<String> editionKey) {
        this.editionKey = editionKey;
    }

    public List<String> getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(List<String> publishDate) {
        this.publishDate = publishDate;
    }

    public List<Integer> getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(List<Integer> publishYear) {
        this.publishYear = publishYear;
    }

    public Integer getFirstPublishYear() {
        return firstPublishYear;
    }

    public void setFirstPublishYear(Integer firstPublishYear) {
        this.firstPublishYear = firstPublishYear;
    }

    public Integer getNumberOfPagesMedian() {
        return numberOfPagesMedian;
    }

    public void setNumberOfPagesMedian(Integer numberOfPagesMedian) {
        this.numberOfPagesMedian = numberOfPagesMedian;
    }

    public List<String> getLccn() {
        return lccn;
    }

    public void setLccn(List<String> lccn) {
        this.lccn = lccn;
    }

    public List<String> getPublishPlace() {
        return publishPlace;
    }

    public void setPublishPlace(List<String> publishPlace) {
        this.publishPlace = publishPlace;
    }

    public List<String> getOclc() {
        return oclc;
    }

    public void setOclc(List<String> oclc) {
        this.oclc = oclc;
    }

    public List<String> getContributor() {
        return contributor;
    }

    public void setContributor(List<String> contributor) {
        this.contributor = contributor;
    }

    public List<String> getLcc() {
        return lcc;
    }

    public void setLcc(List<String> lcc) {
        this.lcc = lcc;
    }

    public List<String> getDdc() {
        return ddc;
    }

    public void setDdc(List<String> ddc) {
        this.ddc = ddc;
    }

    public List<String> getIsbn() {
        return isbn;
    }

    public void setIsbn(List<String> isbn) {
        this.isbn = isbn;
    }

    public Integer getLastModifiedI() {
        return lastModifiedI;
    }

    public void setLastModifiedI(Integer lastModifiedI) {
        this.lastModifiedI = lastModifiedI;
    }

    public List<String> getIa() {
        return ia;
    }

    public void setIa(List<String> ia) {
        this.ia = ia;
    }

    public Integer getEbookCountI() {
        return ebookCountI;
    }

    public void setEbookCountI(Integer ebookCountI) {
        this.ebookCountI = ebookCountI;
    }

    public Boolean getHasFulltext() {
        return hasFulltext;
    }

    public void setHasFulltext(Boolean hasFulltext) {
        this.hasFulltext = hasFulltext;
    }

    public Boolean getPublicScanB() {
        return publicScanB;
    }

    public void setPublicScanB(Boolean publicScanB) {
        this.publicScanB = publicScanB;
    }

    public String getIaCollectionS() {
        return iaCollectionS;
    }

    public void setIaCollectionS(String iaCollectionS) {
        this.iaCollectionS = iaCollectionS;
    }

    public String getLendingEditionS() {
        return lendingEditionS;
    }

    public void setLendingEditionS(String lendingEditionS) {
        this.lendingEditionS = lendingEditionS;
    }

    public String getLendingIdentifierS() {
        return lendingIdentifierS;
    }

    public void setLendingIdentifierS(String lendingIdentifierS) {
        this.lendingIdentifierS = lendingIdentifierS;
    }

    public String getPrintdisabledS() {
        return printdisabledS;
    }

    public void setPrintdisabledS(String printdisabledS) {
        this.printdisabledS = printdisabledS;
    }

    public String getCoverEditionKey() {
        return coverEditionKey;
    }

    public void setCoverEditionKey(String coverEditionKey) {
        this.coverEditionKey = coverEditionKey;
    }

    public Integer getCoverI() {
        return coverI;
    }

    public void setCoverI(Integer coverI) {
        this.coverI = coverI;
    }

    public List<String> getPublisher() {
        return publisher;
    }

    public void setPublisher(List<String> publisher) {
        this.publisher = publisher;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public List<String> getAuthorKey() {
        return authorKey;
    }

    public void setAuthorKey(List<String> authorKey) {
        this.authorKey = authorKey;
    }

    public List<String> getAuthorName() {
        return authorName;
    }

    public void setAuthorName(List<String> authorName) {
        this.authorName = authorName;
    }

    public List<String> getAuthorAlternativeName() {
        return authorAlternativeName;
    }

    public void setAuthorAlternativeName(List<String> authorAlternativeName) {
        this.authorAlternativeName = authorAlternativeName;
    }

    public List<String> getPerson() {
        return person;
    }

    public void setPerson(List<String> person) {
        this.person = person;
    }

    public List<String> getPlace() {
        return place;
    }

    public void setPlace(List<String> place) {
        this.place = place;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public List<String> getTime() {
        return time;
    }

    public void setTime(List<String> time) {
        this.time = time;
    }

    public List<String> getIdAlibrisId() {
        return idAlibrisId;
    }

    public void setIdAlibrisId(List<String> idAlibrisId) {
        this.idAlibrisId = idAlibrisId;
    }

    public List<String> getIdAmazon() {
        return idAmazon;
    }

    public void setIdAmazon(List<String> idAmazon) {
        this.idAmazon = idAmazon;
    }

    public List<String> getIdCanadianNationalLibraryArchive() {
        return idCanadianNationalLibraryArchive;
    }

    public void setIdCanadianNationalLibraryArchive(List<String> idCanadianNationalLibraryArchive) {
        this.idCanadianNationalLibraryArchive = idCanadianNationalLibraryArchive;
    }

    public List<String> getIdDepSitoLegal() {
        return idDepSitoLegal;
    }

    public void setIdDepSitoLegal(List<String> idDepSitoLegal) {
        this.idDepSitoLegal = idDepSitoLegal;
    }

    public List<String> getIdGoodreads() {
        return idGoodreads;
    }

    public void setIdGoodreads(List<String> idGoodreads) {
        this.idGoodreads = idGoodreads;
    }

    public List<String> getIdGoogle() {
        return idGoogle;
    }

    public void setIdGoogle(List<String> idGoogle) {
        this.idGoogle = idGoogle;
    }

    public List<String> getIdLibrarything() {
        return idLibrarything;
    }

    public void setIdLibrarything(List<String> idLibrarything) {
        this.idLibrarything = idLibrarything;
    }

    public List<String> getIdOverdrive() {
        return idOverdrive;
    }

    public void setIdOverdrive(List<String> idOverdrive) {
        this.idOverdrive = idOverdrive;
    }

    public List<String> getIdPaperbackSwap() {
        return idPaperbackSwap;
    }

    public void setIdPaperbackSwap(List<String> idPaperbackSwap) {
        this.idPaperbackSwap = idPaperbackSwap;
    }

    public List<String> getIdWikidata() {
        return idWikidata;
    }

    public void setIdWikidata(List<String> idWikidata) {
        this.idWikidata = idWikidata;
    }

    public List<String> getIaLoadedId() {
        return iaLoadedId;
    }

    public void setIaLoadedId(List<String> iaLoadedId) {
        this.iaLoadedId = iaLoadedId;
    }

    public List<String> getIaBoxId() {
        return iaBoxId;
    }

    public void setIaBoxId(List<String> iaBoxId) {
        this.iaBoxId = iaBoxId;
    }

    public List<String> getPublisherFacet() {
        return publisherFacet;
    }

    public void setPublisherFacet(List<String> publisherFacet) {
        this.publisherFacet = publisherFacet;
    }

    public List<String> getPersonKey() {
        return personKey;
    }

    public void setPersonKey(List<String> personKey) {
        this.personKey = personKey;
    }

    public List<String> getPlaceKey() {
        return placeKey;
    }

    public void setPlaceKey(List<String> placeKey) {
        this.placeKey = placeKey;
    }

    public List<String> getTimeFacet() {
        return timeFacet;
    }

    public void setTimeFacet(List<String> timeFacet) {
        this.timeFacet = timeFacet;
    }

    public List<String> getPersonFacet() {
        return personFacet;
    }

    public void setPersonFacet(List<String> personFacet) {
        this.personFacet = personFacet;
    }

    public List<String> getSubjectFacet() {
        return subjectFacet;
    }

    public void setSubjectFacet(List<String> subjectFacet) {
        this.subjectFacet = subjectFacet;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<String> getPlaceFacet() {
        return placeFacet;
    }

    public void setPlaceFacet(List<String> placeFacet) {
        this.placeFacet = placeFacet;
    }

    public String getLccSort() {
        return lccSort;
    }

    public void setLccSort(String lccSort) {
        this.lccSort = lccSort;
    }

    public List<String> getAuthorFacet() {
        return authorFacet;
    }

    public void setAuthorFacet(List<String> authorFacet) {
        this.authorFacet = authorFacet;
    }

    public List<String> getSubjectKey() {
        return subjectKey;
    }

    public void setSubjectKey(List<String> subjectKey) {
        this.subjectKey = subjectKey;
    }

    public String getDdcSort() {
        return ddcSort;
    }

    public void setDdcSort(String ddcSort) {
        this.ddcSort = ddcSort;
    }

    public List<String> getTimeKey() {
        return timeKey;
    }

    public void setTimeKey(List<String> timeKey) {
        this.timeKey = timeKey;
    }

}
