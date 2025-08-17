# List Project — Android Application

A simple Android application that enables users to **manage a list of items (apples)** with images, names, dates, prices, and descriptions. Users can view details of each item and delete items dynamically. Built with Java and a custom adapter for ListView.

---

## **Key Features**

- **Item Management:** Display a list of apples and delete items.
- **Custom Adapter:** Each item includes an image, name, and delete button.
- **Parcelable Objects:** Pass item data efficiently between components.
- **Dynamic Updates:** ListView refreshes immediately upon deletion.
- **State Preservation:** Maintains selected item details during device rotation.

---

## **Tech Stack**

| Layer     | Technology           |
| --------- | ------------------ |
| Platform  | Android             |
| Language  | Java                |
| UI        | XML Layouts, ListView|
| Data      | Parcelable objects  |

---

## **Project Structure**

- **Apples.java** — Model class representing apple items, implementing Parcelable.
- **CustomAdapter.java** — Adapter to populate ListView with item details and handle delete actions.
- **MainActivity.java** — Main activity displaying the ListView and handling item interactions.
- **res/layout/custom_adapter.xml** — Layout for individual list items.
- **res/layout/activity_main.xml** — Main activity layout containing the ListView.
- **res/drawable/** — Folder for apple images.

---

## **Quick Start**

1. Clone the project to your Android Studio workspace.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or physical device.

---

## **Usage Notes**

- **View Item Details:** Tap on an item to see its date, price, and description.
- **Delete Items:** Press the "Delete" button on a list item to remove it.
- **Dynamic List Updates:** Deletions are reflected immediately using `notifyDataSetChanged()`.
- **Orientation Changes:** Item details and list state are preserved during screen rotation.

---

## **Future Improvements**

- Integrate a local database (SQLite or Room) for persistent storage.
- Add functionality to edit and add new items.
- Implement user authentication for multi-user support.
- Enable sorting and filtering of items.
- Add detailed views for each item with richer information.
- Improve UI/UX design with material components.

---

## **Acknowledgements**

This project demonstrates Android development skills including:

- Creating Parcelable model classes for data transfer.
- Implementing a custom adapter for ListView.
- Managing UI interactions and dynamic updates.
- Handling state preservation during device configuration changes.

