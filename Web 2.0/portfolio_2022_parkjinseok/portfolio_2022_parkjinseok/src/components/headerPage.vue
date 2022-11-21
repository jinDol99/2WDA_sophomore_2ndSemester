<template>
    <div class="head">
        <h1>{{ msg }}</h1>
    </div>
</template>
  
<script>
export default {
    name: 'headerPage',
    data() {
        return {
            msg: '헤더 TEST'
        }
    }
}
</script>

<style>
.head {
    background-color: #b4e0e1;
}
</style>
  