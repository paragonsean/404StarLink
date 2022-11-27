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
from openapi_client.models.dict import Dict
from openapi_client.models.event_dimensions_event_type import EventDimensionsEventType
from typing import Optional, Set
from typing_extensions import Self

class CampaignEventFilterDimensions(BaseModel):
    """
    CampaignEventFilterDimensions
    """ # noqa: E501
    attributes: Optional[Any] = Field(default=None, alias="Attributes")
    event_type: Optional[EventDimensionsEventType] = Field(default=None, alias="EventType")
    metrics: Optional[Any] = Field(default=None, alias="Metrics")
    __properties: ClassVar[List[str]] = ["Attributes", "EventType", "Metrics"]

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
        """Create an instance of CampaignEventFilterDimensions from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of event_type
        if self.event_type:
            _dict['EventType'] = self.event_type.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of CampaignEventFilterDimensions from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Attributes": obj.get("Attributes"),
            "EventType": EventDimensionsEventType.from_dict(obj["EventType"]) if obj.get("EventType") is not None else None,
            "Metrics": obj.get("Metrics")
        })
        return _obj


