# LegalEntityAssociation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associator_id** | **str** | The unique identifier of another legal entity with which the &#x60;legalEntityId&#x60; is associated. When the &#x60;legalEntityId&#x60; is associated to legal entities other than the current one, the response returns all the associations. | [optional] [readonly] 
**entity_type** | **str** | The legal entity type of associated legal entity.   For example, **organization**, **soleProprietorship** or **individual**.  | [optional] [readonly] 
**job_title** | **str** | The individual&#39;s job title if the &#x60;type&#x60; is **uboThroughControl** or **signatory**. | [optional] 
**legal_entity_id** | **str** | The unique identifier of the associated [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id). | 
**name** | **str** | The name of the associated [legal entity](https://docs.adyen.com/api-explorer/legalentity/latest/post/legalEntities#responses-200-id).  - For **individual**, &#x60;name.firstName&#x60; and &#x60;name.lastName&#x60;. - For **organization**, &#x60;legalName&#x60;. - For **soleProprietorship**, &#x60;name&#x60;. | [optional] [readonly] 
**type** | **str** | Defines the relationship of the legal entity to the current legal entity.   Possible values for organizations: **uboThroughOwnership**, **uboThroughControl**, **signatory**, or **ultimateParentCompany**.   Possible values for sole proprietorships: **soleProprietorship**.  | 

## Example

```python
from openapi_client.models.legal_entity_association import LegalEntityAssociation

# TODO update the JSON string below
json = "{}"
# create an instance of LegalEntityAssociation from a JSON string
legal_entity_association_instance = LegalEntityAssociation.from_json(json)
# print the JSON string representation of the object
print(LegalEntityAssociation.to_json())

# convert the object into a dict
legal_entity_association_dict = legal_entity_association_instance.to_dict()
# create an instance of LegalEntityAssociation from a dict
legal_entity_association_from_dict = LegalEntityAssociation.from_dict(legal_entity_association_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


