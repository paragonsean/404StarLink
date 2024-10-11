# Application


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_aggregated_status** | [**ApplicationApplicationAggregatedStatus**](ApplicationApplicationAggregatedStatus.md) |  | [optional] 
**application_id** | **str** |  | [optional] 
**arn** | **str** |  | [optional] 
**creation_date_time** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**is_archived** | **bool** |  | [optional] 
**last_modified_date_time** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**wave_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.application import Application

# TODO update the JSON string below
json = "{}"
# create an instance of Application from a JSON string
application_instance = Application.from_json(json)
# print the JSON string representation of the object
print(Application.to_json())

# convert the object into a dict
application_dict = application_instance.to_dict()
# create an instance of Application from a dict
application_from_dict = Application.from_dict(application_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


