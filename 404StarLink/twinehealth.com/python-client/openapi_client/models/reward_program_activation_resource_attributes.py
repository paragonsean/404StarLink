# coding: utf-8

"""
    Fitbit Plus API

    # Overview The Fitbit Plus API is a RESTful API. The requests and responses are formated according to the [JSON API](http://jsonapi.org/format/1.0/) specification.  In addition to this documentation, we also provide an [OpenAPI](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md) \"yaml\" file describing the API: [Fitbit Plus API Specification](swagger.yaml).  # Authentication Authentication for the Fitbit Plus API is based on the [OAuth 2.0 Authorization Framework](https://tools.ietf.org/html/rfc6749). Fitbit Plus currently supports grant types of **client_credentials** and **refresh_token**.  See [POST /oauth/token](#operation/createToken) for details on the request and response formats. <!-- ReDoc-Inject: <security-definitions> -->  ## Building Integrations We will provide customers with unique client credentials for each application/integration they build, allowing us to enforce appropriate access controls and monitor API usage. The client credentials will be scoped to the organization, and allow full access to all patients and related data within that organization.  These credentials are appropriate for creating an integration that does one of the following:  - background reporting/analysis  - synchronizing data with another system (such as an EMR)  The API credentials and oauth flows we currently support are **not** well suited for creating a user-facing application that allows a user (patient, coach, or admin) to login and have access to data which is appropriate to that specific user. It is possible to build such an application, but it is not possible to use Fitbit Plus as a federated identity provider. You would need to have a separate means of verifying a user's identity. We do not currently support the required password-based oauth flow to make this possible.  # Paging The Fitbit Plus API supports two different pagination strategies for GET collection endpoints.  #### Skip-based paging  Skip-based paging uses the query parameters `page[size]` and `page[number]` to specify the max number of resources returned and the page number. We default to skip-based paging if there are no page parameters. The response will include a `links` object containing links to the first, last, prev, and next pages of data.  If the contents of the collection change while you are iterating through the collection, you will see duplicate or missing documents. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=1`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[size]=50&page[number]=2`, the first entry in the second response will be a duplicate of the last entry in the first response.  #### Cursor-based paging Cursor-based paging uses the query parameters `page[limit]` and `page[after]` to specify the max number of entries returned and identify where to begin the next page. Add `page[limit]` to the parameters to use cursor-based paging. The response will include a `links` object containing a link to the next page of data, if the next page exists.  Cursor-based paging is not subject to duplication if new resources are added to the collection. For example, if you are iterating through the `calender_event` resource via `GET /pub/calendar_event?sort=start_at&page[limit]=50`, and a new `calendar_event` is created that has a `start_at` value before the first `calendar_event`, you will not see a duplicate entry when you fetch the next page at `GET /pub/calendar_event?sort=start_at&page[limit]=50&page[after]=<cursor>`.  We encourage the use of cursor-based paging for performance reasons.  In either form of paging, you can determine whether any resources were missed by comparing the number of fetched resources against `meta.count`. Set `page[size]` or `page[limit]` to 0 to get only the count.  It is not valid to mix the two strategies. 

    The version of the OpenAPI document: v7.78.1
    Contact: apiteam@twinehealth.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self

class RewardProgramActivationResourceAttributes(BaseModel):
    """
    RewardProgramActivationResourceAttributes
    """ # noqa: E501
    activated_at: StrictStr = Field(description="Date at which the reward program was activated for the patient. (Must be between the start_at and end_at dates for the reward program)")
    active: Optional[StrictBool] = Field(default=True, description="If true, the reward program is currently active.")
    allocated_count: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Number of rewards allocated. (Read-only property)")
    budget_unit: Optional[StrictStr] = Field(default=None, description="Unit of the reward program budget. (Read-only property)")
    deactivated_at: Optional[StrictStr] = Field(default=None, description="Date at which the reward program was deactivated. (Must be after the activated_at date)")
    earned_count: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Number of reward earnings. (Read-only property)")
    expires_at: Optional[StrictStr] = Field(default=None, description="Date at which the reward program activation expires. (Read-only property set by adding the days_active from the reward program to the activated_at date)")
    fulfill_as_earned: Optional[StrictBool] = Field(default=None, description="If true, the rewards created for a patient for the program can be fulfulled as they are earned. If false, the rewards should only be fulfilled when the program is deactivated. (Read-only property denormalized from the reward program)")
    total_allocated_value: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Total value of reward allocated. (Read-only property)")
    total_earned_value: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Total value of reward earnings. (Read-only property)")
    __properties: ClassVar[List[str]] = ["activated_at", "active", "allocated_count", "budget_unit", "deactivated_at", "earned_count", "expires_at", "fulfill_as_earned", "total_allocated_value", "total_earned_value"]

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
        """Create an instance of RewardProgramActivationResourceAttributes from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "allocated_count",
            "budget_unit",
            "earned_count",
            "expires_at",
            "fulfill_as_earned",
            "total_allocated_value",
            "total_earned_value",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of RewardProgramActivationResourceAttributes from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "activated_at": obj.get("activated_at"),
            "active": obj.get("active") if obj.get("active") is not None else True,
            "allocated_count": obj.get("allocated_count"),
            "budget_unit": obj.get("budget_unit"),
            "deactivated_at": obj.get("deactivated_at"),
            "earned_count": obj.get("earned_count"),
            "expires_at": obj.get("expires_at"),
            "fulfill_as_earned": obj.get("fulfill_as_earned"),
            "total_allocated_value": obj.get("total_allocated_value"),
            "total_earned_value": obj.get("total_earned_value")
        })
        return _obj


