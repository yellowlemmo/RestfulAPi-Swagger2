package com.restful.demo.restful.main;

import com.restful.demo.restful.pojo.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: main
 * @DESCRIPT: TODO
 * @AUTHOR: cuizhichao
 * @DATA: 2019/7/30 11:57 AM
 **/

@RestController
@RequestMapping(value = "/users")
public class main {

    @ApiOperation(value = "获取用户",notes = "")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String getUsers(){

        return "";
    }

    @ApiOperation(value = "创建用户",notes = "")
    @ApiImplicitParam(name = "user",value = "用户详细实体",required = true,dataType = "User")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public String postUser(@RequestBody User user){

        return "success";
    }

    @ApiOperation(value = "获取用户信息",notes = "根据id获取用户信息")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "String")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable String id){

        return new User("1","czc");
    }

    @ApiOperation(value = "修改用户",notes = "根据url传来的id获取user信息并修改为传来的user信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "String"),
            @ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "User")})
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String putUser(@PathVariable String id){

        return "success";
    }


    @ApiOperation(value = "删除用户",notes = "根据id删除用户")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "String")
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable String id){

        return "success";
    }

    @PostMapping(value = "/hello")
    @ApiOperation(value = "你好人类",notes = "")
    public String helloUser(){

        return "";
    }
}
