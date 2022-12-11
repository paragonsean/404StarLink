# AnalyticsCollection


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonymous_id** | **str** |  | [optional] 
**properties** | **Dict[str, str]** |  | [optional] 
**session_id** | **str** |  | [optional] 
**type** | **str** |  | [optional] 
**user_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.analytics_collection import AnalyticsCollection

# TODO update the JSON string below
json = "{}"
# create an instance of AnalyticsCollection from a JSON string
analytics_collection_instance = AnalyticsCollection.from_json(json)
# print the JSON string representation of the object
print(AnalyticsCollection.to_json())

# convert the object into a dict
analytics_collection_dict = analytics_collection_instance.to_dict()
# create an instance of AnalyticsCollection from a dict
analytics_collection_from_dict = AnalyticsCollection.from_dict(analytics_collection_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


