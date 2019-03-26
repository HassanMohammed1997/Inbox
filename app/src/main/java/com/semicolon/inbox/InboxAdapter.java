package com.semicolon.inbox;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Recycler;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.util.ArrayList;
import java.util.List;

public class InboxAdapter extends RecyclerView.Adapter<InboxAdapter.ViewHolder> {

  private List<Inbox> inboxList = new ArrayList<>();
  private Context context;

  public InboxAdapter(List<Inbox> inboxList, Context context) {
    this.inboxList = inboxList;
    this.context = context;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
    View itemView = LayoutInflater.from(context)
        .inflate(R.layout.inbox_list_item, viewGroup, false);
    return new ViewHolder(itemView);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    Inbox inbox = inboxList.get(position);
    holder.avatar.setImageResource(inbox.getAvatar());
    holder.username.setText(inbox.getUsername());
    holder.message.setText(inbox.getMessage());


  }

  @Override
  public int getItemCount() {
    return inboxList.size();
  }

  public class ViewHolder extends RecyclerView.ViewHolder {

    public CircleImageView avatar;
    public TextView username, message;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);

      avatar = itemView.findViewById(R.id.avatar_image);
      username = itemView.findViewById(R.id.username_text);
      message = itemView.findViewById(R.id.message_text);
    }
  }
}
