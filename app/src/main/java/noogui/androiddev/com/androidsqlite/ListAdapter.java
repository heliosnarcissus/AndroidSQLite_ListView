package noogui.androiddev.com.androidsqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrenacia on 1/9/17.
 */

public class ListAdapter extends BaseAdapter {

    private static final String TAG = ListAdapter.class.getName();
    private List<Contact> stringList;

    public ListAdapter(int  max){
        stringList = new ArrayList<Contact>();
        for (int i = 0; i < max; i++){
            Contact object = new Contact();
            object.set_id(i+1);
            stringList.add(object);
        }
    }

    private static class ViewHolder {
        TextView id;
        TextView name;
        TextView number;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;
        ViewHolder holder;

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) viewGroup.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_row, viewGroup, false);

            holder = new ViewHolder();
            holder.header = (TextView) view.findViewById(R.id.row_header);
            holder.item = (TextView) view.findViewById(R.id.row_item);
            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}
