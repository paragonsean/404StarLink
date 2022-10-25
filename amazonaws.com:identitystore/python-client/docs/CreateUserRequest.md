# CreateUserRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**user_name** | **str** |  | [optional] 
**name** | [**CreateUserRequestName**](CreateUserRequestName.md) |  | [optional] 
**display_name** | **str** |  | [optional] 
**nick_name** | **str** |  | [optional] 
**profile_url** | **str** |  | [optional] 
**emails** | **List** |  | [optional] 
**addresses** | **List** |  | [optional] 
**phone_numbers** | **List** |  | [optional] 
**user_type** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**preferred_language** | **str** |  | [optional] 
**locale** | **str** |  | [optional] 
**timezone** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.create_user_request import CreateUserRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateUserRequest from a JSON string
create_user_request_instance = CreateUserRequest.from_json(json)
# print the JSON string representation of the object
print(CreateUserRequest.to_json())

# convert the object into a dict
create_user_request_dict = create_user_request_instance.to_dict()
# create an instance of CreateUserRequest from a dict
create_user_request_from_dict = CreateUserRequest.from_dict(create_user_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


