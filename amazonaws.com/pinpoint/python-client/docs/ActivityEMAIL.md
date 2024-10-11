# ActivityEMAIL


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_config** | [**EmailMessageActivityMessageConfig**](EmailMessageActivityMessageConfig.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 
**template_name** | **str** |  | [optional] 
**template_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.activity_email import ActivityEMAIL

# TODO update the JSON string below
json = "{}"
# create an instance of ActivityEMAIL from a JSON string
activity_email_instance = ActivityEMAIL.from_json(json)
# print the JSON string representation of the object
print(ActivityEMAIL.to_json())

# convert the object into a dict
activity_email_dict = activity_email_instance.to_dict()
# create an instance of ActivityEMAIL from a dict
activity_email_from_dict = ActivityEMAIL.from_dict(activity_email_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


