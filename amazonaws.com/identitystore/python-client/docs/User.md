# User

A user object that contains the metadata and attributes for a specified user.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**user_name** | **str** |  | [optional] 
**user_id** | **str** |  | 
**external_ids** | **List** |  | [optional] 
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
**identity_store_id** | **str** |  | 

## Example

```python
from openapi_client.models.user import User

# TODO update the JSON string below
json = "{}"
# create an instance of User from a JSON string
user_instance = User.from_json(json)
# print the JSON string representation of the object
print(User.to_json())

# convert the object into a dict
user_dict = user_instance.to_dict()
# create an instance of User from a dict
user_from_dict = User.from_dict(user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


