# Presale

Event's Presale Info

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Description of the presame | [optional] 
**end_date_time** | **datetime** | Presale&#39;s end dates. The date and time when the presale will end | [optional] 
**name** | **str** | Name of the presale | [optional] 
**start_date_time** | **datetime** | Presale&#39;s start dates. The date and time when the presale will start | [optional] 
**url** | **str** | Presale link URL | [optional] 

## Example

```python
from openapi_client.models.presale import Presale

# TODO update the JSON string below
json = "{}"
# create an instance of Presale from a JSON string
presale_instance = Presale.from_json(json)
# print the JSON string representation of the object
print(Presale.to_json())

# convert the object into a dict
presale_dict = presale_instance.to_dict()
# create an instance of Presale from a dict
presale_from_dict = Presale.from_dict(presale_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


