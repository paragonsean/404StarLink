# coding: utf-8

"""
    Amazon Pinpoint

    Doc Engage API - Amazon Pinpoint API

    The version of the OpenAPI document: 2016-12-01
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
from openapi_client.models.create_segment_request_write_segment_request_dimensions import CreateSegmentRequestWriteSegmentRequestDimensions
from openapi_client.models.create_segment_request_write_segment_request_segment_groups import CreateSegmentRequestWriteSegmentRequestSegmentGroups
from typing import Optional, Set
from typing_extensions import Self

class WriteSegmentRequest(BaseModel):
    """
    Specifies the configuration, dimension, and other settings for a segment. A WriteSegmentRequest object can include a Dimensions object or a SegmentGroups object, but not both.
    """ # noqa: E501
    dimensions: Optional[CreateSegmentRequestWriteSegmentRequestDimensions] = Field(default=None, alias="Dimensions")
    name: Optional[Any] = Field(default=None, alias="Name")
    segment_groups: Optional[CreateSegmentRequestWriteSegmentRequestSegmentGroups] = Field(default=None, alias="SegmentGroups")
    tags: Optional[Any] = None
    __properties: ClassVar[List[str]] = ["Dimensions", "Name", "SegmentGroups", "tags"]

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
        """Create an instance of WriteSegmentRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of dimensions
        if self.dimensions:
            _dict['Dimensions'] = self.dimensions.to_dict()
        # override the default output from pydantic by calling `to_dict()` of segment_groups
        if self.segment_groups:
            _dict['SegmentGroups'] = self.segment_groups.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of WriteSegmentRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Dimensions": CreateSegmentRequestWriteSegmentRequestDimensions.from_dict(obj["Dimensions"]) if obj.get("Dimensions") is not None else None,
            "Name": obj.get("Name"),
            "SegmentGroups": CreateSegmentRequestWriteSegmentRequestSegmentGroups.from_dict(obj["SegmentGroups"]) if obj.get("SegmentGroups") is not None else None,
            "tags": obj.get("tags")
        })
        return _obj


