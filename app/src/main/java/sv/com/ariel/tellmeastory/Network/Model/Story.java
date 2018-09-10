package sv.com.ariel.tellmeastory.Network.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import com.google.gson.annotations.SerializedName;


public class Story implements Parcelable {

	@SerializedName("Category")
	private Category category;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	@SerializedName("state")
	private int state;

	@SerializedName("Section")
	private List<SectionItem> section;

	@SerializedName("idCategory")
	private int idCategory;

	protected Story(Parcel in) {
		name = in.readString();
		id = in.readInt();
		state = in.readInt();
		idCategory = in.readInt();
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(name);
		dest.writeInt(id);
		dest.writeInt(state);
		dest.writeInt(idCategory);
	}

	@Override
	public int describeContents() {
		return 0;
	}

	public static final Creator<Story> CREATOR = new Creator<Story>() {
		@Override
		public Story createFromParcel(Parcel in) {
			return new Story(in);
		}

		@Override
		public Story[] newArray(int size) {
			return new Story[size];
		}
	};

	public void setCategory(Category category){
		this.category = category;
	}

	public Category getCategory(){
		return category;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setState(int state){
		this.state = state;
	}

	public int getState(){
		return state;
	}

	public void setSection(List<SectionItem> section){
		this.section = section;
	}

	public List<SectionItem> getSection(){
		return section;
	}

	public void setIdCategory(int idCategory){
		this.idCategory = idCategory;
	}

	public int getIdCategory(){
		return idCategory;
	}

	@Override
 	public String toString(){
		return name;
		}
}