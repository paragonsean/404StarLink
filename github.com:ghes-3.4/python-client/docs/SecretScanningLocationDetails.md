# SecretScanningLocationDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_sha** | **str** | SHA-1 hash ID of the associated blob | 
**blob_url** | **str** | The API URL to get the associated blob resource | 
**commit_sha** | **str** | SHA-1 hash ID of the associated commit | 
**commit_url** | **str** | The API URL to get the associated commit resource | 
**end_column** | **float** | The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII | 
**end_line** | **float** | Line number at which the secret ends in the file | 
**path** | **str** | The file path in the repository | 
**start_column** | **float** | The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII | 
**start_line** | **float** | Line number at which the secret starts in the file | 

## Example

```python
from openapi_client.models.secret_scanning_location_details import SecretScanningLocationDetails

# TODO update the JSON string below
json = "{}"
# create an instance of SecretScanningLocationDetails from a JSON string
secret_scanning_location_details_instance = SecretScanningLocationDetails.from_json(json)
# print the JSON string representation of the object
print(SecretScanningLocationDetails.to_json())

# convert the object into a dict
secret_scanning_location_details_dict = secret_scanning_location_details_instance.to_dict()
# create an instance of SecretScanningLocationDetails from a dict
secret_scanning_location_details_from_dict = SecretScanningLocationDetails.from_dict(secret_scanning_location_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


