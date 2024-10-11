# ActivityCUSTOM


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_uri** | **str** |  | [optional] 
**endpoint_types** | **List** |  | [optional] 
**message_config** | [**CustomMessageActivityMessageConfig**](CustomMessageActivityMessageConfig.md) |  | [optional] 
**next_activity** | **str** |  | [optional] 
**template_name** | **str** |  | [optional] 
**template_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.activity_custom import ActivityCUSTOM

# TODO update the JSON string below
json = "{}"
# create an instance of ActivityCUSTOM from a JSON string
activity_custom_instance = ActivityCUSTOM.from_json(json)
# print the JSON string representation of the object
print(ActivityCUSTOM.to_json())

# convert the object into a dict
activity_custom_dict = activity_custom_instance.to_dict()
# create an instance of ActivityCUSTOM from a dict
activity_custom_from_dict = ActivityCUSTOM.from_dict(activity_custom_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


