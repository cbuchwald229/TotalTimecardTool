//final annoated ListItem POJO
package model;

//All these import statements came in by clicking the red X and using Import option from the javax.persistence.package
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Items")
public class ListItem
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	public ListItem()
	{
	}
	
	public ListItem(String store, String item)
	{
		this.store = store;
		this.item = item;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getStore()
	{
		return store;
	}
	
	public void setStore(String store)
	{
		this.store = store;
	}
	
	public String getItem()
	{
		return item;
	}
	
	public void setItem(String item)
	{
		this.item = item;
	}

	@Override
	public String toString()
	{
		return this.store + " --- " + this.item;
	}
}