/*
 * Copyright 2015 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.plugin.plugin;

import com.hivemq.spi.HiveMQPluginModule;
import com.hivemq.spi.PluginEntryPoint;
import com.hivemq.spi.plugin.meta.Information;


@Information(name = "InfluxDb Monitoring", author = "Christoph Schäbel", version = "1.0.0")
public class InfluxDbMonitoringModule extends HiveMQPluginModule {

    /**
     * This method is provided to execute some custom plugin configuration stuff. Is is the place
     * to execute Google Guice bindings,etc if needed.
     */
    @Override
    protected void configurePlugin() {

    }

    /**
     * This method needs to return the main class of the plugin.
     *
     * @return callback priority
     */
    @Override
    protected Class<? extends PluginEntryPoint> entryPointClass() {
        return InfluxDbMonitoringEntryPoint.class;
    }
}
