//package com.hussain.tasktesting.compose
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.hussain.tasktesting.compose.ui.theme.TaskTestingTheme
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.foundation.shape.CircleShape
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.*
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
////import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
////import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            FoodDeliveryApp()
//        }
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun FoodDeliveryApp() {
//    var selectedTab by remember { mutableStateOf(0) }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFF5F5F5))
//    ) {
//        // Top Status Bar
//        TopAppBar(
//            title = {
//                Text(
//                    "9:41",
//                    color = Color.White,
//                    fontSize = 16.sp,
//                    fontWeight = FontWeight.Medium
//                )
//            },
//            actions = {
//                Row {
//                    Icon(
//                        Icons.Default.SignalCellularAlt,
//                        contentDescription = null,
//                        tint = Color.White,
//                        modifier = Modifier.size(16.dp)
//                    )
//                    Spacer(modifier = Modifier.width(4.dp))
//                    Icon(
//                        Icons.Default.Wifi,
//                        contentDescription = null,
//                        tint = Color.White,
//                        modifier = Modifier.size(16.dp)
//                    )
//                    Spacer(modifier = Modifier.width(4.dp))
//                    Icon(
//                        Icons.Default.BatteryFull,
//                        contentDescription = null,
//                        tint = Color.White,
//                        modifier = Modifier.size(16.dp)
//                    )
//                }
//            },
//            colors = TopAppBarDefaults.topAppBarColors(
//                containerColor = Color(0xFFD2691E)
//            )
//        )
//
//        if (selectedTab == 0) {
//            MainScreen()
//        } else {
//            VoucherScreen()
//        }
//
//        Spacer(modifier = Modifier.weight(1f))
//
//        // Bottom Navigation
//        BottomNavigation(
//            selectedTab = selectedTab,
//            onTabSelected = { selectedTab = it }
//        )
//    }
//}
//
//@Composable
//fun MainScreen() {
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(horizontal = 16.dp),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        item {
//            Spacer(modifier = Modifier.height(8.dp))
//
//            // Header
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Column {
//                    Text(
//                        "Good Afternoon!",
//                        fontSize = 16.sp,
//                        color = Color.Gray
//                    )
//                    Text(
//                        "Hi Mandani",
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        color = Color.Black
//                    )
//                }
//
//                Icon(
//                    Icons.Default.Person,
//                    contentDescription = "Profile",
//                    modifier = Modifier
//                        .size(40.dp)
//                        .clip(CircleShape)
//                        .background(Color(0xFFD2691E))
//                        .padding(8.dp),
//                    tint = Color.White
//                )
//            }
//        }
//
//        item {
//            // Points Card
//            Card(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(80.dp),
//                shape = RoundedCornerShape(12.dp),
//                colors = CardDefaults.cardColors(containerColor = Color.White)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(16.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Icon(
//                        Icons.Default.Star,
//                        contentDescription = null,
//                        tint = Color(0xFFD2691E),
//                        modifier = Modifier.size(24.dp)
//                    )
//                    Spacer(modifier = Modifier.width(12.dp))
//                    Column {
//                        Text(
//                            "242 Point",
//                            fontSize = 18.sp,
//                            fontWeight = FontWeight.Bold,
//                            color = Color.Black
//                        )
//                        Text(
//                            "You have 242 points for prizes",
//                            fontSize = 12.sp,
//                            color = Color.Gray
//                        )
//                    }
//                    Spacer(modifier = Modifier.weight(1f))
//                    Icon(
//                        Icons.Default.CardGiftcard,
//                        contentDescription = null,
//                        tint = Color(0xFFD2691E),
//                        modifier = Modifier.size(32.dp)
//                    )
//                }
//            }
//        }
//
//        item {
//            // Special Offer Card
//            Card(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(120.dp),
//                shape = RoundedCornerShape(12.dp),
//                colors = CardDefaults.cardColors(containerColor = Color(0xFFD2691E))
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(16.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Column(
//                        modifier = Modifier.weight(1f)
//                    ) {
//                        Text(
//                            "Special Offer",
//                            fontSize = 14.sp,
//                            color = Color.White,
//                            fontWeight = FontWeight.Medium
//                        )
//                        Text(
//                            "Caffeine Apps",
//                            fontSize = 18.sp,
//                            color = Color.White,
//                            fontWeight = FontWeight.Bold
//                        )
//                        Spacer(modifier = Modifier.height(8.dp))
//                        Text(
//                            "Get discount up to",
//                            fontSize = 12.sp,
//                            color = Color.White.copy(alpha = 0.9f)
//                        )
//                        Text(
//                            "IDR 15K",
//                            fontSize = 20.sp,
//                            color = Color.White,
//                            fontWeight = FontWeight.Bold
//                        )
//                        Text(
//                            "Terms and Conditions apply",
//                            fontSize = 10.sp,
//                            color = Color.White.copy(alpha = 0.8f)
//                        )
//                    }
//
//                    // Coffee cup illustration placeholder
//                    Box(
//                        modifier = Modifier
//                            .size(80.dp)
//                            .background(
//                                Color.White.copy(alpha = 0.2f),
//                                RoundedCornerShape(8.dp)
//                            ),
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Icon(
//                            Icons.Default.LocalCafe,
//                            contentDescription = null,
//                            tint = Color.White,
//                            modifier = Modifier.size(40.dp)
//                        )
//                    }
//                }
//            }
//        }
//
//        item {
//            // Order Now Button
//            Button(
//                onClick = { },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(50.dp),
//                shape = RoundedCornerShape(8.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.Black
//                )
//            ) {
//                Text(
//                    "Order Now",
//                    color = Color.White,
//                    fontSize = 16.sp,
//                    fontWeight = FontWeight.Medium
//                )
//            }
//        }
//
//        item {
//            // Delivery Options
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceEvenly
//            ) {
//                DeliveryOption(
//                    icon = Icons.Default.Store,
//                    title = "Pick Up",
//                    subtitle = "Order will be prepared and ready for pickup at the store",
//                    modifier = Modifier.weight(1f)
//                )
//
//                Spacer(modifier = Modifier.width(16.dp))
//
//                DeliveryOption(
//                    icon = Icons.Default.DeliveryDining,
//                    title = "Delivery",
//                    subtitle = "Order will be delivered to your location",
//                    modifier = Modifier.weight(1f)
//                )
//            }
//        }
//
//        item {
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // For You Section
//            Text(
//                "For You!",
//                fontSize = 20.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color.Black
//            )
//
//            Spacer(modifier = Modifier.height(12.dp))
//
//            // Discount Card
//            Card(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(100.dp),
//                shape = RoundedCornerShape(12.dp),
//                colors = CardDefaults.cardColors(containerColor = Color.White)
//            ) {
//                Row(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(16.dp),
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Column(
//                        modifier = Modifier.weight(1f)
//                    ) {
//                        Text(
//                            "Discount 75%",
//                            fontSize = 16.sp,
//                            fontWeight = FontWeight.Bold,
//                            color = Color(0xFFD2691E)
//                        )
//                        Text(
//                            "All discount menu",
//                            fontSize = 12.sp,
//                            color = Color.Gray
//                        )
//                        Text(
//                            "download Kopi Apps",
//                            fontSize = 12.sp,
//                            color = Color.Gray
//                        )
//                    }
//
//                    Box(
//                        modifier = Modifier
//                            .size(60.dp)
//                            .background(
//                                Color(0xFFD2691E).copy(alpha = 0.1f),
//                                RoundedCornerShape(8.dp)
//                            ),
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Icon(
//                            Icons.Default.Coffee,
//                            contentDescription = null,
//                            tint = Color(0xFFD2691E),
//                            modifier = Modifier.size(30.dp)
//                        )
//                    }
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun VoucherScreen() {
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(horizontal = 16.dp),
//        verticalArrangement = Arrangement.spacedBy(16.dp)
//    ) {
//        item {
//            Spacer(modifier = Modifier.height(16.dp))
//
//            // Voucher Header
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.SpaceBetween,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                IconButton(onClick = { }) {
//                    Icon(
//                        Icons.Default.ArrowBack,
//                        contentDescription = "Back",
//                        tint = Color.Black
//                    )
//                }
//
//                Text(
//                    "Voucher",
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color.Black
//                )
//
//                Spacer(modifier = Modifier.width(48.dp))
//            }
//        }
//
//        item {
//            // Voucher Type Tabs
//            Row(
//                modifier = Modifier.fillMaxWidth(),
//                horizontalArrangement = Arrangement.spacedBy(8.dp)
//            ) {
//                VoucherTab(
//                    text = "Shopping Voucher",
//                    isSelected = true,
//                    modifier = Modifier.weight(1f)
//                )
//                VoucherTab(
//                    text = "Delivery Voucher",
//                    isSelected = false,
//                    modifier = Modifier.weight(1f)
//                )
//            }
//        }
//
//        item {
//            Text(
//                "My Voucher",
//                fontSize = 18.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color.Black
//            )
//        }
//
//        items(listOf(
//            VoucherData("Special For You! Discount 25% max. IDR 25K", "27 Apr 2024", "IDR 50.000"),
//            VoucherData("#WeekendCeria Discount 50% max. IDR 15K", "27 Apr 2024", "IDR 48.000"),
//            VoucherData("#WeekendCeria Discount 50% max. IDR 15K (Pickup Only)", "27 Apr 2024", "No Transaction")
//        )) { voucher ->
//            VoucherCard(voucher)
//        }
//    }
//}
//
//@Composable
//fun DeliveryOption(
//    icon: ImageVector,
//    title: String,
//    subtitle: String,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = modifier.height(80.dp),
//        shape = RoundedCornerShape(8.dp),
//        colors = CardDefaults.cardColors(containerColor = Color.White)
//    ) {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(12.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
//        ) {
//            Icon(
//                icon,
//                contentDescription = null,
//                tint = Color.Black,
//                modifier = Modifier.size(24.dp)
//            )
//            Spacer(modifier = Modifier.height(4.dp))
//            Text(
//                title,
//                fontSize = 12.sp,
//                fontWeight = FontWeight.Bold,
//                color = Color.Black,
//                textAlign = TextAlign.Center
//            )
//            Text(
//                subtitle,
//                fontSize = 8.sp,
//                color = Color.Gray,
//                textAlign = TextAlign.Center,
//                maxLines = 2
//            )
//        }
//    }
//}
//
//@Composable
//fun VoucherTab(
//    text: String,
//    isSelected: Boolean,
//    modifier: Modifier = Modifier
//) {
//    Button(
//        onClick = { },
//        modifier = modifier.height(40.dp),
//        shape = RoundedCornerShape(20.dp),
//        colors = ButtonDefaults.buttonColors(
//            containerColor = if (isSelected) Color(0xFFD2691E) else Color.White,
//            contentColor = if (isSelected) Color.White else Color.Gray
//        )
//    ) {
//        Text(
//            text,
//            fontSize = 12.sp,
//            fontWeight = FontWeight.Medium
//        )
//    }
//}
//
//data class VoucherData(
//    val title: String,
//    val date: String,
//    val amount: String
//)
//
//@Composable
//fun VoucherCard(voucher: VoucherData) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(100.dp),
//        shape = RoundedCornerShape(12.dp),
//        colors = CardDefaults.cardColors(containerColor = Color.White)
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(16.dp),
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            // Voucher Icon
//            Box(
//                modifier = Modifier
//                    .size(50.dp)
//                    .background(
//                        Color(0xFFD2691E).copy(alpha = 0.1f),
//                        RoundedCornerShape(8.dp)
//                    ),
//                contentAlignment = Alignment.Center
//            ) {
//                Icon(
//                    Icons.Default.LocalOffer,
//                    contentDescription = null,
//                    tint = Color(0xFFD2691E),
//                    modifier = Modifier.size(24.dp)
//                )
//            }
//
//            Spacer(modifier = Modifier.width(12.dp))
//
//            Column(
//                modifier = Modifier.weight(1f)
//            ) {
//                Text(
//                    voucher.title,
//                    fontSize = 12.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color.Black,
//                    maxLines = 2
//                )
//                Spacer(modifier = Modifier.height(4.dp))
//                Text(
//                    voucher.date,
//                    fontSize = 10.sp,
//                    color = Color.Gray
//                )
//                Text(
//                    voucher.amount,
//                    fontSize = 10.sp,
//                    color = Color.Gray
//                )
//            }
//
//            Button(
//                onClick = { },
//                modifier = Modifier.height(30.dp),
//                shape = RoundedCornerShape(15.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color(0xFFD2691E)
//                )
//            ) {
//                Text(
//                    "Apply",
//                    fontSize = 10.sp,
//                    color = Color.White,
//                    fontWeight = FontWeight.Medium
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun BottomNavigation(
//    selectedTab: Int,
//    onTabSelected: (Int) -> Unit
//) {
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(80.dp),
//        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
//        colors = CardDefaults.cardColors(containerColor = Color.White)
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(horizontal = 20.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            verticalAlignment = Alignment.CenterVertically
//        ) {
//            BottomNavItem(
//                icon = Icons.Default.Home,
//                label = "Home",
//                isSelected = selectedTab == 0,
//                onClick = { onTabSelected(0) }
//            )
//            BottomNavItem(
//                icon = Icons.Default.LocalOffer,
//                label = "Voucher",
//                isSelected = selectedTab == 1,
//                onClick = { onTabSelected(1) }
//            )
//            BottomNavItem(
//                icon = Icons.Default.ShoppingCart,
//                label = "Order",
//                isSelected = selectedTab == 2,
//                onClick = { onTabSelected(2) }
//            )
//            BottomNavItem(
//                icon = Icons.Default.Person,
//                label = "Account",
//                isSelected = selectedTab == 3,
//                onClick = { onTabSelected(3) }
//            )
//        }
//    }
//}
//
//@Composable
//fun BottomNavItem(
//    icon: ImageVector,
//    label: String,
//    isSelected: Boolean,
//    onClick: () -> Unit
//) {
//    Column(
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .padding(8.dp)
//    ) {
//        IconButton(onClick = onClick) {
//            Icon(
//                icon,
//                contentDescription = label,
//                tint = if (isSelected) Color(0xFFD2691E) else Color.Gray,
//                modifier = Modifier.size(24.dp)
//            )
//        }
//        Text(
//            label,
//            fontSize = 10.sp,
//            color = if (isSelected) Color(0xFFD2691E) else Color.Gray,
//            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
//        )
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun FoodDeliveryAppPreview() {
//    FoodDeliveryApp()
//}
//
////
////class MainActivity : ComponentActivity() {
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        enableEdgeToEdge()
////        setContent {
////            TaskTestingTheme {
////                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
////                    Greeting(
////                        name = "Android",
////                        modifier = Modifier.padding(innerPadding)
////                    )
////                }
////            }
////        }
////    }
////}
////
////@Composable
////fun Greeting(name: String, modifier: Modifier = Modifier) {
////    Text(
////        text = "Hello $name!",
////        modifier = modifier
////    )
////}
////
////@Preview(showBackground = true)
////@Composable
////fun GreetingPreview() {
////    TaskTestingTheme {
////        Greeting("Android")
////    }
////}