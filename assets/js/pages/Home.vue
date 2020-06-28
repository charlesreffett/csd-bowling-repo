<template>
    <div>
        <el-input v-model="send_pins"></el-input>
        <el-button @click="buttonClick">Submit</el-button>
    </div>
</template>
<script>
    import axios from 'axios';

    export default {
        name: 'Home',
        data() {
            return {
                send_pins: 0,
                got_pins: 0
            }
        },
        methods: {
            buttonClick() {
                let that = this;
                axios.post('/pin-manager', {
                        'pins': this.send_pins
                    },
                    {
                        'content-type': 'application/json'
                    }).then((response) => {
                    this.got_pins = response.data.pins;
                    this.setBowled();
                }).catch((error) => {
                    console.log(error);
                    this.$notify({
                        type: "error",
                        title: "An Error Occurred!",
                        message: error.response.data.pe.message,
                        duration: 0
                    });
                })
            },
            setBowled() {
                this.$notify({
                    type: "success",
                    title: 'Bowled!',
                    message: this.got_pins,
                    duration: 0
                });
            },

        }
    }
</script>
<style scoped>
</style>