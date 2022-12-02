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
from openapi_client.models.amazon_open_search_serverless_destination_configuration_retry_options import AmazonOpenSearchServerlessDestinationConfigurationRetryOptions
from openapi_client.models.amazon_open_search_serverless_destination_update_buffering_hints import AmazonOpenSearchServerlessDestinationUpdateBufferingHints
from openapi_client.models.cloud_watch_logging_options import CloudWatchLoggingOptions
from openapi_client.models.processing_configuration import ProcessingConfiguration
from openapi_client.models.s3_destination_update import S3DestinationUpdate
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate(BaseModel):
    """
    UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate
    """ # noqa: E501
    role_arn: Optional[Any] = Field(default=None, alias="RoleARN")
    collection_endpoint: Optional[Any] = Field(default=None, alias="CollectionEndpoint")
    index_name: Optional[Any] = Field(default=None, alias="IndexName")
    buffering_hints: Optional[AmazonOpenSearchServerlessDestinationUpdateBufferingHints] = Field(default=None, alias="BufferingHints")
    retry_options: Optional[AmazonOpenSearchServerlessDestinationConfigurationRetryOptions] = Field(default=None, alias="RetryOptions")
    s3_update: Optional[S3DestinationUpdate] = Field(default=None, alias="S3Update")
    processing_configuration: Optional[ProcessingConfiguration] = Field(default=None, alias="ProcessingConfiguration")
    cloud_watch_logging_options: Optional[CloudWatchLoggingOptions] = Field(default=None, alias="CloudWatchLoggingOptions")
    __properties: ClassVar[List[str]] = ["RoleARN", "CollectionEndpoint", "IndexName", "BufferingHints", "RetryOptions", "S3Update", "ProcessingConfiguration", "CloudWatchLoggingOptions"]

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
        """Create an instance of UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of buffering_hints
        if self.buffering_hints:
            _dict['BufferingHints'] = self.buffering_hints.to_dict()
        # override the default output from pydantic by calling `to_dict()` of retry_options
        if self.retry_options:
            _dict['RetryOptions'] = self.retry_options.to_dict()
        # override the default output from pydantic by calling `to_dict()` of s3_update
        if self.s3_update:
            _dict['S3Update'] = self.s3_update.to_dict()
        # override the default output from pydantic by calling `to_dict()` of processing_configuration
        if self.processing_configuration:
            _dict['ProcessingConfiguration'] = self.processing_configuration.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cloud_watch_logging_options
        if self.cloud_watch_logging_options:
            _dict['CloudWatchLoggingOptions'] = self.cloud_watch_logging_options.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UpdateDestinationInputAmazonOpenSearchServerlessDestinationUpdate from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "RoleARN": obj.get("RoleARN"),
            "CollectionEndpoint": obj.get("CollectionEndpoint"),
            "IndexName": obj.get("IndexName"),
            "BufferingHints": AmazonOpenSearchServerlessDestinationUpdateBufferingHints.from_dict(obj["BufferingHints"]) if obj.get("BufferingHints") is not None else None,
            "RetryOptions": AmazonOpenSearchServerlessDestinationConfigurationRetryOptions.from_dict(obj["RetryOptions"]) if obj.get("RetryOptions") is not None else None,
            "S3Update": S3DestinationUpdate.from_dict(obj["S3Update"]) if obj.get("S3Update") is not None else None,
            "ProcessingConfiguration": ProcessingConfiguration.from_dict(obj["ProcessingConfiguration"]) if obj.get("ProcessingConfiguration") is not None else None,
            "CloudWatchLoggingOptions": CloudWatchLoggingOptions.from_dict(obj["CloudWatchLoggingOptions"]) if obj.get("CloudWatchLoggingOptions") is not None else None
        })
        return _obj


