# ProjectPrice


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **float** |  | [optional] 
**base_amount** | **float** |  | [optional] 
**base_currency** | **str** |  | [optional] [default to 'usd']
**currency** | **str** |  | [optional] [default to 'usd']
**usd_amount** | **float** | USD is our base pricing currency. If &#x60;currency&#x60; is different, this will help. | [optional] 

## Example

```python
from openapi_client.models.project_price import ProjectPrice

# TODO update the JSON string below
json = "{}"
# create an instance of ProjectPrice from a JSON string
project_price_instance = ProjectPrice.from_json(json)
# print the JSON string representation of the object
print(ProjectPrice.to_json())

# convert the object into a dict
project_price_dict = project_price_instance.to_dict()
# create an instance of ProjectPrice from a dict
project_price_from_dict = ProjectPrice.from_dict(project_price_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


