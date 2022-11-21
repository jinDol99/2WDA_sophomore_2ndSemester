<template>
    <div class="foot">
        <h1>{{ msg }}</h1>
    </div>
</template>
  
<script>
export default {
    name: 'footer',
    data() {
        return {
            msg: '푸터 TEST'
        }
    }
}
</script>

<style>
.foot {
    background-color: #454f50;
}
</style>
  