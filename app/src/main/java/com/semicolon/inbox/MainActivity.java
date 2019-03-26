package com.semicolon.inbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  private RecyclerView inboxRecyclerView;
  List<Inbox> inboxes = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    inboxRecyclerView = findViewById(R.id.inbox_recycler_view);
    inboxRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    inboxRecyclerView.setHasFixedSize(true);

    populateInboxData();

  }

  private void populateInboxData() {
    Inbox inbox;

    inbox = new Inbox("Hassan Mohammed", "Hello, Mohammed", R.drawable.avatar_1);
    inboxes.add(inbox);

    inbox = new Inbox("Mohammed Ahmed", "How are you?", R.drawable.avatar_2);
    inboxes.add(inbox);

    inbox = new Inbox("Khalid Mohammed", "What's about u?", R.drawable.avatar_1);
    inboxes.add(inbox);

    inbox = new Inbox("Hamdy", "What's your favorite song?", R.drawable.avatar_2);
    inboxes.add(inbox);

    inbox = new Inbox("Mohammed Khalid", "Congratulations", R.drawable.avatar_1);
    inboxes.add(inbox);

    inbox = new Inbox("Mohammed Khalid", "Congratulations", R.drawable.avatar_2);
    inboxes.add(inbox);

    inbox = new Inbox("Mohammed Khalid", "Congratulations", R.drawable.avatar_1);
    inboxes.add(inbox);

    inbox = new Inbox("Mohammed Khalid", "Congratulations", R.drawable.avatar_2);
    inboxes.add(inbox);

    inbox = new Inbox("Mohammed Khalid", "Congratulations", R.drawable.avatar_1);
    inboxes.add(inbox);

    InboxAdapter adapter = new InboxAdapter(inboxes, this);

    inboxRecyclerView.setAdapter(adapter);



  }
}
