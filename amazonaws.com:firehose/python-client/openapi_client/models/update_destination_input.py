# coding: utf-8

"""
    Amazon Kinesis Firehose

    <fullname>Amazon Kinesis Data Firehose API Reference</fullname> <p>Amazon Kinesis Data Firehose is a fully managed service that delivers real-time streaming data to destinations such as Amazon Simple Storage Service (Amazon S3), Amazon OpenSearch Service, Amazon Redshift, Splunk, and various other supportd destinations.</p>

    The version of the OpenAPI document: 2015-08-04
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.update_destination_input_amazon_open_search_serverless_destination_update import UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate
from openapi_client.models.update_destination_input_amazonopensearchservice_destination_update import UpdateDestinationInputAmazonopensearchserviceDestinationUpdate
from openapi_client.models.update_destination_input_elasticsearch_destination_update import UpdateDestinationInputElasticsearchDestinationUpdate
from openapi_client.models.update_destination_input_extended_s3_destination_update import UpdateDestinationInputExtendedS3DestinationUpdate
from openapi_client.models.update_destination_input_http_endpoint_destination_update import UpdateDestinationInputHttpEndpointDestinationUpdate
from openapi_client.models.update_destination_input_redshift_destination_update import UpdateDestinationInputRedshiftDestinationUpdate
from openapi_client.models.update_destination_input_s3_destination_update import UpdateDestinationInputS3DestinationUpdate
from openapi_client.models.update_destination_input_splunk_destination_update import UpdateDestinationInputSplunkDestinationUpdate
from typing import Optional, Set
from typing_extensions import Self

class UpdateDestinationInput(BaseModel):
    """
    UpdateDestinationInput
    """ # noqa: E501
    delivery_stream_name: Any = Field(alias="DeliveryStreamName")
    current_delivery_stream_version_id: Any = Field(alias="CurrentDeliveryStreamVersionId")
    destination_id: Any = Field(alias="DestinationId")
    s3_destination_update: Optional[UpdateDestinationInputS3DestinationUpdate] = Field(default=None, alias="S3DestinationUpdate")
    extended_s3_destination_update: Optional[UpdateDestinationInputExtendedS3DestinationUpdate] = Field(default=None, alias="ExtendedS3DestinationUpdate")
    redshift_destination_update: Optional[UpdateDestinationInputRedshiftDestinationUpdate] = Field(default=None, alias="RedshiftDestinationUpdate")
    elasticsearch_destination_update: Optional[UpdateDestinationInputElasticsearchDestinationUpdate] = Field(default=None, alias="ElasticsearchDestinationUpdate")
    amazonopensearchservice_destination_update: Optional[UpdateDestinationInputAmazonopensearchserviceDestinationUpdate] = Field(default=None, alias="AmazonopensearchserviceDestinationUpdate")
    splunk_destination_update: Optional[UpdateDestinationInputSplunkDestinationUpdate] = Field(default=None, alias="SplunkDestinationUpdate")
    http_endpoint_destination_update: Optional[UpdateDestinationInputHttpEndpointDestinationUpdate] = Field(default=None, alias="HttpEndpointDestinationUpdate")
    amazon_open_search_serverless_destination_update: Optional[UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate] = Field(default=None, alias="AmazonOpenSearchServerlessDestinationUpdate")
    __properties: ClassVar[List[str]] = ["DeliveryStreamName", "CurrentDeliveryStreamVersionId", "DestinationId", "S3DestinationUpdate", "ExtendedS3DestinationUpdate", "RedshiftDestinationUpdate", "ElasticsearchDestinationUpdate", "AmazonopensearchserviceDestinationUpdate", "SplunkDestinationUpdate", "HttpEndpointDestinationUpdate", "AmazonOpenSearchServerlessDestinationUpdate"]

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of UpdateDestinationInput from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of s3_destination_update
        if self.s3_destination_update:
            _dict['S3DestinationUpdate'] = self.s3_destination_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of extended_s3_destination_update
        if self.extended_s3_destination_update:
            _dict['ExtendedS3DestinationUpdate'] = self.extended_s3_destination_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of redshift_destination_update
        if self.redshift_destination_update:
            _dict['RedshiftDestinationUpdate'] = self.redshift_destination_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of elasticsearch_destination_update
        if self.elasticsearch_destination_update:
            _dict['ElasticsearchDestinationUpdate'] = self.elasticsearch_destination_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of amazonopensearchservice_destination_update
        if self.amazonopensearchservice_destination_update:
            _dict['AmazonopensearchserviceDestinationUpdate'] = self.amazonopensearchservice_destination_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of splunk_destination_update
        if self.splunk_destination_update:
            _dict['SplunkDestinationUpdate'] = self.splunk_destination_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of http_endpoint_destination_update
        if self.http_endpoint_destination_update:
            _dict['HttpEndpointDestinationUpdate'] = self.http_endpoint_destination_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of amazon_open_search_serverless_destination_update
        if self.amazon_open_search_serverless_destination_update:
            _dict['AmazonOpenSearchServerlessDestinationUpdate'] = self.amazon_open_search_serverless_destination_update.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UpdateDestinationInput from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "DeliveryStreamName": obj.get("DeliveryStreamName"),
            "CurrentDeliveryStreamVersionId": obj.get("CurrentDeliveryStreamVersionId"),
            "DestinationId": obj.get("DestinationId"),
            "S3DestinationUpdate": UpdateDestinationInputS3DestinationUpdate.from_dict(obj["S3DestinationUpdate"]) if obj.get("S3DestinationUpdate") is not None else None,
            "ExtendedS3DestinationUpdate": UpdateDestinationInputExtendedS3DestinationUpdate.from_dict(obj["ExtendedS3DestinationUpdate"]) if obj.get("ExtendedS3DestinationUpdate") is not None else None,
            "RedshiftDestinationUpdate": UpdateDestinationInputRedshiftDestinationUpdate.from_dict(obj["RedshiftDestinationUpdate"]) if obj.get("RedshiftDestinationUpdate") is not None else None,
            "ElasticsearchDestinationUpdate": UpdateDestinationInputElasticsearchDestinationUpdate.from_dict(obj["ElasticsearchDestinationUpdate"]) if obj.get("ElasticsearchDestinationUpdate") is not None else None,
            "AmazonopensearchserviceDestinationUpdate": UpdateDestinationInputAmazonopensearchserviceDestinationUpdate.from_dict(obj["AmazonopensearchserviceDestinationUpdate"]) if obj.get("AmazonopensearchserviceDestinationUpdate") is not None else None,
            "SplunkDestinationUpdate": UpdateDestinationInputSplunkDestinationUpdate.from_dict(obj["SplunkDestinationUpdate"]) if obj.get("SplunkDestinationUpdate") is not None else None,
            "HttpEndpointDestinationUpdate": UpdateDestinationInputHttpEndpointDestinationUpdate.from_dict(obj["HttpEndpointDestinationUpdate"]) if obj.get("HttpEndpointDestinationUpdate") is not None else None,
            "AmazonOpenSearchServerlessDestinationUpdate": UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate.from_dict(obj["AmazonOpenSearchServerlessDestinationUpdate"]) if obj.get("AmazonOpenSearchServerlessDestinationUpdate") is not None else None
        })
        return _obj


