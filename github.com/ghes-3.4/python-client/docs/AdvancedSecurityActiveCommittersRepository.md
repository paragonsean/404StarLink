# AdvancedSecurityActiveCommittersRepository


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advanced_security_committers** | **int** |  | 
**advanced_security_committers_breakdown** | [**List[AdvancedSecurityActiveCommittersUser]**](AdvancedSecurityActiveCommittersUser.md) |  | 
**name** | **str** |  | 

## Example

```python
from openapi_client.models.advanced_security_active_committers_repository import AdvancedSecurityActiveCommittersRepository

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedSecurityActiveCommittersRepository from a JSON string
advanced_security_active_committers_repository_instance = AdvancedSecurityActiveCommittersRepository.from_json(json)
# print the JSON string representation of the object
print(AdvancedSecurityActiveCommittersRepository.to_json())

# convert the object into a dict
advanced_security_active_committers_repository_dict = advanced_security_active_committers_repository_instance.to_dict()
# create an instance of AdvancedSecurityActiveCommittersRepository from a dict
advanced_security_active_committers_repository_from_dict = AdvancedSecurityActiveCommittersRepository.from_dict(advanced_security_active_committers_repository_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


