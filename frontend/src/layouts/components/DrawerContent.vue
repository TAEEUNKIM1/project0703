<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: '유저 관리' }" />
        <VerticalNavLink
            :item="{
                title: '유저관리',
                to: '/users',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '도서관리' }" />
        <VerticalNavLink
            :item="{
                title: '도서 관리',
                to: '/books',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Admin' }" />
        <VerticalNavLink
            :item="{
                title: 'Admin',
                to: '/admins',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '작가 관리' }" />
        <VerticalNavLink
            :item="{
                title: '작가관리',
                to: '/authors',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '작가 목록',
                to: '/authorLists',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '원고 관리' }" />
        <VerticalNavLink
            :item="{
                title: '원고 관리',
                to: '/manuscripts',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '구독 관리' }" />
        <VerticalNavLink
            :item="{
                title: '구독 관리',
                to: '/subscriptions',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '포인트 관리' }" />
        <VerticalNavLink
            :item="{
                title: '포인트 관리',
                to: '/points',
            }"
        />
    </ul>
</template>
