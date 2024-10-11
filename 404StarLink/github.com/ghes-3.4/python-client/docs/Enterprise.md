# Enterprise

An enterprise on GitHub.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**avatar_url** | **str** |  | 
**created_at** | **datetime** |  | 
**description** | **str** | A short description of the enterprise. | [optional] 
**html_url** | **str** |  | 
**id** | **int** | Unique identifier of the enterprise | 
**name** | **str** | The name of the enterprise. | 
**node_id** | **str** |  | 
**slug** | **str** | The slug url identifier for the enterprise. | 
**updated_at** | **datetime** |  | 
**website_url** | **str** | The enterprise&#39;s website URL. | [optional] 

## Example

```python
from openapi_client.models.enterprise import Enterprise

# TODO update the JSON string below
json = "{}"
# create an instance of Enterprise from a JSON string
enterprise_instance = Enterprise.from_json(json)
# print the JSON string representation of the object
print(Enterprise.to_json())

# convert the object into a dict
enterprise_dict = enterprise_instance.to_dict()
# create an instance of Enterprise from a dict
enterprise_from_dict = Enterprise.from_dict(enterprise_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


