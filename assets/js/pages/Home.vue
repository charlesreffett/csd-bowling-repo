<template>
    <div>
        <el-input v-model="pins"></el-input>
        <el-button @click="buttonClick">Submit</el-button>
    </div>
</template>
<script>
    import axios from 'axios';

    export default {
        name: 'Home',
        data() {
            return {
                pins: 0,
            }
        },
        methods: {
            buttonClick() {
                axios.post('/pin-manager', {
                        'pins': this.pins
                    },
                    {
                        'content-type': 'application/json'
                    }).then(function (response) {
                    console.log(response);
                }).catch(function (error) {
                    console.error(error);
                })
            }
        }
    }
</script>
<style scoped>
</style>