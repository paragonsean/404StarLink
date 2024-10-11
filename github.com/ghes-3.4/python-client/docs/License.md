# License

License

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | 
**conditions** | **List[str]** |  | 
**description** | **str** |  | 
**featured** | **bool** |  | 
**html_url** | **str** |  | 
**implementation** | **str** |  | 
**key** | **str** |  | 
**limitations** | **List[str]** |  | 
**name** | **str** |  | 
**node_id** | **str** |  | 
**permissions** | **List[str]** |  | 
**spdx_id** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.license import License

# TODO update the JSON string below
json = "{}"
# create an instance of License from a JSON string
license_instance = License.from_json(json)
# print the JSON string representation of the object
print(License.to_json())

# convert the object into a dict
license_dict = license_instance.to_dict()
# create an instance of License from a dict
license_from_dict = License.from_dict(license_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


