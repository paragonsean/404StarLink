# UserUpdateContent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**city** | **str** |  | [optional] 
**country** | **str** |  | [optional] 
**phone** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**street** | **str** |  | [optional] 
**zip** | **str** |  | [optional] 
**birthday** | **date** |  | [optional] 
**email** | **str** | Optional. User e-mail. | [optional] 
**first_name** | **str** | Optional. User first name. | [optional] 
**id** | **int** | Optional. ID of the user being updated. | [optional] 
**last_name** | **str** | Optional. User last name. | [optional] 
**notifications** | [**UserUpdateContentAllOfNotifications**](UserUpdateContentAllOfNotifications.md) |  | [optional] 
**notify** | **bool** | Notify new user account creation with login information and MotaWord introduction. | [optional] 
**paypal_email** | **str** | Optional. Vendor paypal e-mail | [optional] 
**require_1099** | **bool** | Optional. Whether this vendor requires 1099 form in US for their earnings. | [optional] 
**user_groups** | **List[int]** | A list of user group IDs | [optional] 

## Example

```python
from openapi_client.models.user_update_content import UserUpdateContent

# TODO update the JSON string below
json = "{}"
# create an instance of UserUpdateContent from a JSON string
user_update_content_instance = UserUpdateContent.from_json(json)
# print the JSON string representation of the object
print(UserUpdateContent.to_json())

# convert the object into a dict
user_update_content_dict = user_update_content_instance.to_dict()
# create an instance of UserUpdateContent from a dict
user_update_content_from_dict = UserUpdateContent.from_dict(user_update_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


