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
from openapi_client.models.channel_type import ChannelType
from openapi_client.models.dict import Dict
from openapi_client.models.endpoint_response_user import EndpointResponseUser
from openapi_client.models.str import str
from openapi_client.models.update_endpoint_request_endpoint_request_demographic import UpdateEndpointRequestEndpointRequestDemographic
from openapi_client.models.update_endpoint_request_endpoint_request_location import UpdateEndpointRequestEndpointRequestLocation
from typing import Optional, Set
from typing_extensions import Self

class EventsBatchEndpoint(BaseModel):
    """
    EventsBatchEndpoint
    """ # noqa: E501
    address: Optional[Any] = Field(default=None, alias="Address")
    attributes: Optional[Any] = Field(default=None, alias="Attributes")
    channel_type: Optional[Any] = Field(default=None, alias="ChannelType")
    demographic: Optional[UpdateEndpointRequestEndpointRequestDemographic] = Field(default=None, alias="Demographic")
    effective_date: Optional[Any] = Field(default=None, alias="EffectiveDate")
    endpoint_status: Optional[Any] = Field(default=None, alias="EndpointStatus")
    location: Optional[UpdateEndpointRequestEndpointRequestLocation] = Field(default=None, alias="Location")
    metrics: Optional[Any] = Field(default=None, alias="Metrics")
    opt_out: Optional[Any] = Field(default=None, alias="OptOut")
    request_id: Optional[Any] = Field(default=None, alias="RequestId")
    user: Optional[EndpointResponseUser] = Field(default=None, alias="User")
    __properties: ClassVar[List[str]] = ["Address", "Attributes", "ChannelType", "Demographic", "EffectiveDate", "EndpointStatus", "Location", "Metrics", "OptOut", "RequestId", "User"]

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
        """Create an instance of EventsBatchEndpoint from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of channel_type
        if self.channel_type:
            _dict['ChannelType'] = self.channel_type.to_dict()
        # override the default output from pydantic by calling `to_dict()` of demographic
        if self.demographic:
            _dict['Demographic'] = self.demographic.to_dict()
        # override the default output from pydantic by calling `to_dict()` of location
        if self.location:
            _dict['Location'] = self.location.to_dict()
        # override the default output from pydantic by calling `to_dict()` of user
        if self.user:
            _dict['User'] = self.user.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of EventsBatchEndpoint from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Address": obj.get("Address"),
            "Attributes": obj.get("Attributes"),
            "ChannelType": ChannelType.from_dict(obj["ChannelType"]) if obj.get("ChannelType") is not None else None,
            "Demographic": UpdateEndpointRequestEndpointRequestDemographic.from_dict(obj["Demographic"]) if obj.get("Demographic") is not None else None,
            "EffectiveDate": obj.get("EffectiveDate"),
            "EndpointStatus": obj.get("EndpointStatus"),
            "Location": UpdateEndpointRequestEndpointRequestLocation.from_dict(obj["Location"]) if obj.get("Location") is not None else None,
            "Metrics": obj.get("Metrics"),
            "OptOut": obj.get("OptOut"),
            "RequestId": obj.get("RequestId"),
            "User": EndpointResponseUser.from_dict(obj["User"]) if obj.get("User") is not None else None
        })
        return _obj


