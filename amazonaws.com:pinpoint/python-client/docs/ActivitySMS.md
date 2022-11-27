# ActivitySMS


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_config** | [**SMSMessageActivityMessageConfig**](SMSMessageActivityMessageConfig.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 
**template_name** | **str** |  | [optional] 
**template_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.activity_sms import ActivitySMS

# TODO update the JSON string below
json = "{}"
# create an instance of ActivitySMS from a JSON string
activity_sms_instance = ActivitySMS.from_json(json)
# print the JSON string representation of the object
print(ActivitySMS.to_json())

# convert the object into a dict
activity_sms_dict = activity_sms_instance.to_dict()
# create an instance of ActivitySMS from a dict
activity_sms_from_dict = ActivitySMS.from_dict(activity_sms_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


