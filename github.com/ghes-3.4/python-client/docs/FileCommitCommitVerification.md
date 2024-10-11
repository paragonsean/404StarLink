# FileCommitCommitVerification


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**payload** | **str** |  | [optional] 
**reason** | **str** |  | [optional] 
**signature** | **str** |  | [optional] 
**verified** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.file_commit_commit_verification import FileCommitCommitVerification

# TODO update the JSON string below
json = "{}"
# create an instance of FileCommitCommitVerification from a JSON string
file_commit_commit_verification_instance = FileCommitCommitVerification.from_json(json)
# print the JSON string representation of the object
print(FileCommitCommitVerification.to_json())

# convert the object into a dict
file_commit_commit_verification_dict = file_commit_commit_verification_instance.to_dict()
# create an instance of FileCommitCommitVerification from a dict
file_commit_commit_verification_from_dict = FileCommitCommitVerification.from_dict(file_commit_commit_verification_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


