package lk.dialog.cemstatslibrary.containers.events;

import java.util.Date;

public interface CEMEventDetails {
    Integer getEventTypeID();

    String getReferenceID();

    Date getTimestamp();
}
