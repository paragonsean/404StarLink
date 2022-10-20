# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
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
from openapi_client.models.application_health_status import ApplicationHealthStatus
from openapi_client.models.application_progress_status import ApplicationProgressStatus
from openapi_client.models.int import int
from openapi_client.models.str import str
from typing import Optional, Set
from typing_extensions import Self

class ApplicationApplicationAggregatedStatus(BaseModel):
    """
    ApplicationApplicationAggregatedStatus
    """ # noqa: E501
    health_status: Optional[Any] = Field(default=None, alias="healthStatus")
    last_update_date_time: Optional[Any] = Field(default=None, alias="lastUpdateDateTime")
    progress_status: Optional[Any] = Field(default=None, alias="progressStatus")
    total_source_servers: Optional[Any] = Field(default=None, alias="totalSourceServers")
    __properties: ClassVar[List[str]] = ["healthStatus", "lastUpdateDateTime", "progressStatus", "totalSourceServers"]

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
        """Create an instance of ApplicationApplicationAggregatedStatus from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of health_status
        if self.health_status:
            _dict['healthStatus'] = self.health_status.to_dict()
        # override the default output from pydantic by calling `to_dict()` of progress_status
        if self.progress_status:
            _dict['progressStatus'] = self.progress_status.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of ApplicationApplicationAggregatedStatus from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "healthStatus": ApplicationHealthStatus.from_dict(obj["healthStatus"]) if obj.get("healthStatus") is not None else None,
            "lastUpdateDateTime": obj.get("lastUpdateDateTime"),
            "progressStatus": ApplicationProgressStatus.from_dict(obj["progressStatus"]) if obj.get("progressStatus") is not None else None,
            "totalSourceServers": obj.get("totalSourceServers")
        })
        return _obj


