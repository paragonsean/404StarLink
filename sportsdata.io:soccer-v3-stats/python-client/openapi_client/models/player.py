# coding: utf-8

"""
    Soccer v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Player(BaseModel):
    """
    Player
    """ # noqa: E501
    birth_city: Optional[StrictStr] = Field(default=None, alias="BirthCity")
    birth_country: Optional[StrictStr] = Field(default=None, alias="BirthCountry")
    birth_date: Optional[StrictStr] = Field(default=None, alias="BirthDate")
    common_name: Optional[StrictStr] = Field(default=None, alias="CommonName")
    draft_kings_position: Optional[StrictStr] = Field(default=None, alias="DraftKingsPosition")
    first_name: Optional[StrictStr] = Field(default=None, alias="FirstName")
    foot: Optional[StrictStr] = Field(default=None, alias="Foot")
    gender: Optional[StrictStr] = Field(default=None, alias="Gender")
    height: Optional[StrictInt] = Field(default=None, alias="Height")
    injury_body_part: Optional[StrictStr] = Field(default=None, alias="InjuryBodyPart")
    injury_notes: Optional[StrictStr] = Field(default=None, alias="InjuryNotes")
    injury_start_date: Optional[StrictStr] = Field(default=None, alias="InjuryStartDate")
    injury_status: Optional[StrictStr] = Field(default=None, alias="InjuryStatus")
    jersey: Optional[StrictInt] = Field(default=None, alias="Jersey")
    last_name: Optional[StrictStr] = Field(default=None, alias="LastName")
    nationality: Optional[StrictStr] = Field(default=None, alias="Nationality")
    photo_url: Optional[StrictStr] = Field(default=None, alias="PhotoUrl")
    player_id: Optional[StrictInt] = Field(default=None, alias="PlayerId")
    position: Optional[StrictStr] = Field(default=None, alias="Position")
    position_category: Optional[StrictStr] = Field(default=None, alias="PositionCategory")
    roto_wire_player_id: Optional[StrictInt] = Field(default=None, alias="RotoWirePlayerID")
    short_name: Optional[StrictStr] = Field(default=None, alias="ShortName")
    updated: Optional[StrictStr] = Field(default=None, alias="Updated")
    usa_today_headshot_no_background_updated: Optional[StrictStr] = Field(default=None, alias="UsaTodayHeadshotNoBackgroundUpdated")
    usa_today_headshot_no_background_url: Optional[StrictStr] = Field(default=None, alias="UsaTodayHeadshotNoBackgroundUrl")
    usa_today_headshot_updated: Optional[StrictStr] = Field(default=None, alias="UsaTodayHeadshotUpdated")
    usa_today_headshot_url: Optional[StrictStr] = Field(default=None, alias="UsaTodayHeadshotUrl")
    usa_today_player_id: Optional[StrictInt] = Field(default=None, alias="UsaTodayPlayerID")
    weight: Optional[StrictInt] = Field(default=None, alias="Weight")
    __properties: ClassVar[List[str]] = ["BirthCity", "BirthCountry", "BirthDate", "CommonName", "DraftKingsPosition", "FirstName", "Foot", "Gender", "Height", "InjuryBodyPart", "InjuryNotes", "InjuryStartDate", "InjuryStatus", "Jersey", "LastName", "Nationality", "PhotoUrl", "PlayerId", "Position", "PositionCategory", "RotoWirePlayerID", "ShortName", "Updated", "UsaTodayHeadshotNoBackgroundUpdated", "UsaTodayHeadshotNoBackgroundUrl", "UsaTodayHeadshotUpdated", "UsaTodayHeadshotUrl", "UsaTodayPlayerID", "Weight"]

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
        """Create an instance of Player from a JSON string"""
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
        # set to None if birth_city (nullable) is None
        # and model_fields_set contains the field
        if self.birth_city is None and "birth_city" in self.model_fields_set:
            _dict['BirthCity'] = None

        # set to None if birth_country (nullable) is None
        # and model_fields_set contains the field
        if self.birth_country is None and "birth_country" in self.model_fields_set:
            _dict['BirthCountry'] = None

        # set to None if birth_date (nullable) is None
        # and model_fields_set contains the field
        if self.birth_date is None and "birth_date" in self.model_fields_set:
            _dict['BirthDate'] = None

        # set to None if common_name (nullable) is None
        # and model_fields_set contains the field
        if self.common_name is None and "common_name" in self.model_fields_set:
            _dict['CommonName'] = None

        # set to None if draft_kings_position (nullable) is None
        # and model_fields_set contains the field
        if self.draft_kings_position is None and "draft_kings_position" in self.model_fields_set:
            _dict['DraftKingsPosition'] = None

        # set to None if first_name (nullable) is None
        # and model_fields_set contains the field
        if self.first_name is None and "first_name" in self.model_fields_set:
            _dict['FirstName'] = None

        # set to None if foot (nullable) is None
        # and model_fields_set contains the field
        if self.foot is None and "foot" in self.model_fields_set:
            _dict['Foot'] = None

        # set to None if gender (nullable) is None
        # and model_fields_set contains the field
        if self.gender is None and "gender" in self.model_fields_set:
            _dict['Gender'] = None

        # set to None if height (nullable) is None
        # and model_fields_set contains the field
        if self.height is None and "height" in self.model_fields_set:
            _dict['Height'] = None

        # set to None if injury_body_part (nullable) is None
        # and model_fields_set contains the field
        if self.injury_body_part is None and "injury_body_part" in self.model_fields_set:
            _dict['InjuryBodyPart'] = None

        # set to None if injury_notes (nullable) is None
        # and model_fields_set contains the field
        if self.injury_notes is None and "injury_notes" in self.model_fields_set:
            _dict['InjuryNotes'] = None

        # set to None if injury_start_date (nullable) is None
        # and model_fields_set contains the field
        if self.injury_start_date is None and "injury_start_date" in self.model_fields_set:
            _dict['InjuryStartDate'] = None

        # set to None if injury_status (nullable) is None
        # and model_fields_set contains the field
        if self.injury_status is None and "injury_status" in self.model_fields_set:
            _dict['InjuryStatus'] = None

        # set to None if jersey (nullable) is None
        # and model_fields_set contains the field
        if self.jersey is None and "jersey" in self.model_fields_set:
            _dict['Jersey'] = None

        # set to None if last_name (nullable) is None
        # and model_fields_set contains the field
        if self.last_name is None and "last_name" in self.model_fields_set:
            _dict['LastName'] = None

        # set to None if nationality (nullable) is None
        # and model_fields_set contains the field
        if self.nationality is None and "nationality" in self.model_fields_set:
            _dict['Nationality'] = None

        # set to None if photo_url (nullable) is None
        # and model_fields_set contains the field
        if self.photo_url is None and "photo_url" in self.model_fields_set:
            _dict['PhotoUrl'] = None

        # set to None if position (nullable) is None
        # and model_fields_set contains the field
        if self.position is None and "position" in self.model_fields_set:
            _dict['Position'] = None

        # set to None if position_category (nullable) is None
        # and model_fields_set contains the field
        if self.position_category is None and "position_category" in self.model_fields_set:
            _dict['PositionCategory'] = None

        # set to None if roto_wire_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.roto_wire_player_id is None and "roto_wire_player_id" in self.model_fields_set:
            _dict['RotoWirePlayerID'] = None

        # set to None if short_name (nullable) is None
        # and model_fields_set contains the field
        if self.short_name is None and "short_name" in self.model_fields_set:
            _dict['ShortName'] = None

        # set to None if updated (nullable) is None
        # and model_fields_set contains the field
        if self.updated is None and "updated" in self.model_fields_set:
            _dict['Updated'] = None

        # set to None if usa_today_headshot_no_background_updated (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_headshot_no_background_updated is None and "usa_today_headshot_no_background_updated" in self.model_fields_set:
            _dict['UsaTodayHeadshotNoBackgroundUpdated'] = None

        # set to None if usa_today_headshot_no_background_url (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_headshot_no_background_url is None and "usa_today_headshot_no_background_url" in self.model_fields_set:
            _dict['UsaTodayHeadshotNoBackgroundUrl'] = None

        # set to None if usa_today_headshot_updated (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_headshot_updated is None and "usa_today_headshot_updated" in self.model_fields_set:
            _dict['UsaTodayHeadshotUpdated'] = None

        # set to None if usa_today_headshot_url (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_headshot_url is None and "usa_today_headshot_url" in self.model_fields_set:
            _dict['UsaTodayHeadshotUrl'] = None

        # set to None if usa_today_player_id (nullable) is None
        # and model_fields_set contains the field
        if self.usa_today_player_id is None and "usa_today_player_id" in self.model_fields_set:
            _dict['UsaTodayPlayerID'] = None

        # set to None if weight (nullable) is None
        # and model_fields_set contains the field
        if self.weight is None and "weight" in self.model_fields_set:
            _dict['Weight'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Player from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "BirthCity": obj.get("BirthCity"),
            "BirthCountry": obj.get("BirthCountry"),
            "BirthDate": obj.get("BirthDate"),
            "CommonName": obj.get("CommonName"),
            "DraftKingsPosition": obj.get("DraftKingsPosition"),
            "FirstName": obj.get("FirstName"),
            "Foot": obj.get("Foot"),
            "Gender": obj.get("Gender"),
            "Height": obj.get("Height"),
            "InjuryBodyPart": obj.get("InjuryBodyPart"),
            "InjuryNotes": obj.get("InjuryNotes"),
            "InjuryStartDate": obj.get("InjuryStartDate"),
            "InjuryStatus": obj.get("InjuryStatus"),
            "Jersey": obj.get("Jersey"),
            "LastName": obj.get("LastName"),
            "Nationality": obj.get("Nationality"),
            "PhotoUrl": obj.get("PhotoUrl"),
            "PlayerId": obj.get("PlayerId"),
            "Position": obj.get("Position"),
            "PositionCategory": obj.get("PositionCategory"),
            "RotoWirePlayerID": obj.get("RotoWirePlayerID"),
            "ShortName": obj.get("ShortName"),
            "Updated": obj.get("Updated"),
            "UsaTodayHeadshotNoBackgroundUpdated": obj.get("UsaTodayHeadshotNoBackgroundUpdated"),
            "UsaTodayHeadshotNoBackgroundUrl": obj.get("UsaTodayHeadshotNoBackgroundUrl"),
            "UsaTodayHeadshotUpdated": obj.get("UsaTodayHeadshotUpdated"),
            "UsaTodayHeadshotUrl": obj.get("UsaTodayHeadshotUrl"),
            "UsaTodayPlayerID": obj.get("UsaTodayPlayerID"),
            "Weight": obj.get("Weight")
        })
        return _obj


