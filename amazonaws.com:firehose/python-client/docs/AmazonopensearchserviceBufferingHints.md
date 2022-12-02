# AmazonopensearchserviceBufferingHints

Describes the buffering to perform before delivering data to the Amazon OpenSearch Service destination. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interval_in_seconds** | **int** |  | [optional] 
**size_in_mbs** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.amazonopensearchservice_buffering_hints import AmazonopensearchserviceBufferingHints

# TODO update the JSON string below
json = "{}"
# create an instance of AmazonopensearchserviceBufferingHints from a JSON string
amazonopensearchservice_buffering_hints_instance = AmazonopensearchserviceBufferingHints.from_json(json)
# print the JSON string representation of the object
print(AmazonopensearchserviceBufferingHints.to_json())

# convert the object into a dict
amazonopensearchservice_buffering_hints_dict = amazonopensearchservice_buffering_hints_instance.to_dict()
# create an instance of AmazonopensearchserviceBufferingHints from a dict
amazonopensearchservice_buffering_hints_from_dict = AmazonopensearchserviceBufferingHints.from_dict(amazonopensearchservice_buffering_hints_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


