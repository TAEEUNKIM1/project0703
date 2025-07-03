<template>
  <v-container fluid>
    <v-row>
      <v-card
          v-for="(card, index) in cards"
          :key="index"
          class="mx-auto"
          style="height:300px; width:300px; margin-bottom:20px;"
          outlined
      >
        <v-list-item>
          <v-icon style="margin-top: 30%; margin-left: 37.5%;" color="primary" size="64">mdi-apps</v-icon>
        </v-list-item>
        <v-card-actions>
          <v-btn
              class="mx-auto"
              outlined
              rounded
              :to="card.link"
              style="font-weight:500; font-size:20px; border:solid 2px; max-width:250px; overflow:hidden; margin-top: 10%;"
          >
              {{ card.text }}
          </v-btn>
        </v-card-actions>
      </v-card>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: 'Index',
  data: () => ({
    cards: [
      {
          text: "유저관리",
          link: "/users",
      },
      {
          text: "도서 관리",
          link: "/books",
      },
      {
          text: "Admin",
          link: "/admins",
      },
      {
          text: "작가관리",
          link: "/authors",
      },
      {
          text: "작가 목록",
          link: "/authorLists",
      },
      {
          text: "원고 관리",
          link: "/manuscripts",
      },
      {
          text: "구독 관리",
          link: "/subscriptions",
      },
      {
          text: "포인트 관리",
          link: "/points",
      },
    ],
  }),
};
</script>
