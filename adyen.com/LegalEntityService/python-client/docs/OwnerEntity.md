# OwnerEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of the resource that owns the document. For &#x60;type&#x60; **legalEntity**, this value is the unique identifier of the [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id). For &#x60;type&#x60; **bankAccount**, this value is the unique identifier of the [transfer instrument](https://docs.adyen.com/api-explorer/legalentity/latest/post/transferInstruments#responses-200-id). | 
**type** | **str** | Type of resource that owns the document.  Possible values: **legalEntity**, **bankAccount**. | 

## Example

```python
from openapi_client.models.owner_entity import OwnerEntity

# TODO update the JSON string below
json = "{}"
# create an instance of OwnerEntity from a JSON string
owner_entity_instance = OwnerEntity.from_json(json)
# print the JSON string representation of the object
print(OwnerEntity.to_json())

# convert the object into a dict
owner_entity_dict = owner_entity_instance.to_dict()
# create an instance of OwnerEntity from a dict
owner_entity_from_dict = OwnerEntity.from_dict(owner_entity_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


