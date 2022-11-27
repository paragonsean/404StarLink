# ActivityPUSH


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_config** | [**PushMessageActivityMessageConfig**](PushMessageActivityMessageConfig.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 
**template_name** | **str** |  | [optional] 
**template_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.activity_push import ActivityPUSH

# TODO update the JSON string below
json = "{}"
# create an instance of ActivityPUSH from a JSON string
activity_push_instance = ActivityPUSH.from_json(json)
# print the JSON string representation of the object
print(ActivityPUSH.to_json())

# convert the object into a dict
activity_push_dict = activity_push_instance.to_dict()
# create an instance of ActivityPUSH from a dict
activity_push_from_dict = ActivityPUSH.from_dict(activity_push_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


