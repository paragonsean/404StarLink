# UserUpdateContentAllOfNotifications

Notification settings

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phone_number** | **str** | User phone number | [optional] 
**sms_enabled** | **bool** | User sms notification setting | [optional] 

## Example

```python
from openapi_client.models.user_update_content_all_of_notifications import UserUpdateContentAllOfNotifications

# TODO update the JSON string below
json = "{}"
# create an instance of UserUpdateContentAllOfNotifications from a JSON string
user_update_content_all_of_notifications_instance = UserUpdateContentAllOfNotifications.from_json(json)
# print the JSON string representation of the object
print(UserUpdateContentAllOfNotifications.to_json())

# convert the object into a dict
user_update_content_all_of_notifications_dict = user_update_content_all_of_notifications_instance.to_dict()
# create an instance of UserUpdateContentAllOfNotifications from a dict
user_update_content_all_of_notifications_from_dict = UserUpdateContentAllOfNotifications.from_dict(user_update_content_all_of_notifications_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


